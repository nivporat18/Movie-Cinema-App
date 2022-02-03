package niv.porat.cinema_world

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import niv.porat.cinema_world.repo.AppRepository
import niv.porat.movie_world_project.models.MoviePopular
import niv.porat.movie_world_project.models.MovieRated
import niv.porat.movie_world_project.models.TvPopular
import niv.porat.movie_world_project.models.TvRated
import java.util.*
import kotlin.collections.HashMap

enum class Category {
    MOVIE_POPULAR, MOVIE_RATED, TV_POPULAR, TV_RATED, ALL
}

data class SearchResult(
    val list: List<Any>,
    val category: String,
)

class MainViewModel : ViewModel() {
    private lateinit var searchQuery: String // user searched something

    fun setSearchQuery(q: String, category: List<Category>) {
        searchQuery = q

        searchAction = true
        var categoryMatch = "empty"
        val matchList = mutableListOf<Any>()
        var originalList: MutableList<Any> = mutableListOf()

        if (category.contains(Category.ALL) || category.contains(Category.TV_POPULAR)) {
            store["popular_tv"]?.forEach {
                val popular = it as TvPopular
                val match = popular.title?.lowercase()?.contains(q.lowercase())
                if (match == true) {
                    categoryMatch = "popular_tv"
                    matchList.add(popular)
                }
            }
        }
        if (category.contains(Category.ALL) || category.contains(Category.TV_RATED)) {
            store["rated_tv"]?.forEach {
                val rated = it as TvRated
                val match = rated.title?.lowercase()?.contains(q.lowercase())
                if (match == true) {
                    categoryMatch = "rated_tv"
                    matchList.add(rated)
                }
            }
        }
        if (category.contains(Category.ALL) || category.contains(Category.MOVIE_POPULAR)) {
            store["popular_movie"]?.forEach {
                val popular = it as MoviePopular
                val match = popular.original_title?.lowercase()?.contains(q.lowercase()) ?: false
                if (match) {
                    matchList.add(popular)
                    categoryMatch = "popular_movie"
                }
            }
        }
        if (category.contains(Category.ALL) || category.contains(Category.MOVIE_RATED)) {
            store["rated_movie"]?.forEach {
                val rated = it as MovieRated
                val match = rated.title?.lowercase()?.contains(q.lowercase())
                if (match == true) {
                    matchList.add(rated)
                    categoryMatch = "rated_movie"
                }
            }
        }
        if (categoryMatch == "empty") {
            originalList.addAll(_moviePopular.value ?: listOf())
            _moviePopularSearch.postValue(SearchResult(originalList,
                "popular_movie"))
            originalList = mutableListOf()
            originalList.addAll(_movieRated.value ?: listOf())
            _movieRatedSearch.postValue(SearchResult(originalList,
                "rated_movie"))
            originalList = mutableListOf()
            originalList.addAll(_tvPopular.value ?: listOf())
            _tvPopularSearch.postValue(SearchResult(originalList,
                "popular_tv"))
            originalList = mutableListOf()
            originalList.addAll(_tvRated.value ?: listOf())
            _tvRatedSearch.postValue(SearchResult(originalList,
                "rated_tv"))
        } else {
            when (categoryMatch) {
                "popular_movie" -> {
                    originalList.addAll(store[categoryMatch] ?: listOf())
                    _moviePopularSearch.postValue(SearchResult(matchList.filterIsInstance<MoviePopular>(),
                        "popular_movie"))
                }
                "rated_movie" -> {
                    originalList.addAll(store[categoryMatch] ?: listOf())
                    _movieRatedSearch.postValue(SearchResult(matchList.filterIsInstance<MovieRated>(),
                        "rated_movie"))
                }
                "popular_tv" -> {
                    originalList.addAll(store[categoryMatch] ?: listOf())
                    _tvPopularSearch.postValue(SearchResult(matchList.filterIsInstance<TvPopular>(),
                        "popular_tv"))
                }
                "rated_tv" -> {
                    originalList.addAll(store[categoryMatch] ?: listOf())
                    _tvRatedSearch.postValue(SearchResult(matchList.filterIsInstance<TvRated>(),
                        "rated_tv"))
                }


        }
    }
}


// Popular movies
private val _moviePopular = MutableLiveData<List<MoviePopular>>()
val moviePopular: LiveData<List<MoviePopular>> get() = _moviePopular

// Rated Movies
private val _movieRated = MutableLiveData<List<MovieRated>>()
val movieRated: LiveData<List<MovieRated>> get() = _movieRated

// Tv Popular
private val _tvPopular = MutableLiveData<List<TvPopular>>()
val tvPopular: LiveData<List<TvPopular>> get() = _tvPopular

// Tv Rated
private val _tvRated = MutableLiveData<List<TvRated>>()
val tvRated: LiveData<List<TvRated>> get() = _tvRated


// Search

// Popular movies
private val _moviePopularSearch = MutableLiveData<SearchResult>()
val moviePopularSearch: LiveData<SearchResult> get() = _moviePopularSearch

// Rated Movies
private val _movieRatedSearch = MutableLiveData<SearchResult>()
val movieRatedSearch: LiveData<SearchResult> get() = _movieRatedSearch

// Tv Popular
private val _tvPopularSearch = MutableLiveData<SearchResult>()
val tvPopularSearch: LiveData<SearchResult> get() = _tvPopularSearch

// Tv Rated
private val _tvRatedSearch = MutableLiveData<SearchResult>()
val tvRatedSearch: LiveData<SearchResult> get() = _tvRatedSearch


fun clearSearch() {
    searchAction = false
}

// Errors
private val _error = MutableLiveData<String>()
val error: LiveData<String> get() = _error


private val _allMoviesNames = MutableLiveData<List<String>>()
val allMoviesNames: LiveData<List<String>> get() = _allMoviesNames
// store all movies??
private var store: HashMap<String, List<Any>> = HashMap()
var searchAction: Boolean = false

init {

    // Save movies in hash map
    val handler = CoroutineExceptionHandler { _, throwable ->
        _error.value = throwable.localizedMessage
    }

    viewModelScope.launch(handler) {
        val tvPopular = AppRepository.getTvPopular()
        _tvPopular.value = tvPopular
        store["popular_tv"] = tvPopular
    }

    viewModelScope.launch(handler) {
        val tvRated = AppRepository.getTvRated()
        _tvRated.value = tvRated
        store["rated_tv"] = tvRated

    }
    viewModelScope.launch(handler) {
        val movie = AppRepository.getMovies()
        _moviePopular.value = movie
        store["popular_movie"] = movie
        val names = movie.mapNotNull { it.original_title }
        if (allMoviesNames.value == null) {
            _allMoviesNames.postValue(names)
        }else {
            _allMoviesNames.postValue(names.plus(allMoviesNames.value!!))
        }

    }

    viewModelScope.launch(handler) {
        val movieRated = AppRepository.getMovieRated()
        _movieRated.value = movieRated
        store["rated_movie"] = movieRated
        val names = movieRated.mapNotNull { it.title }
        if (allMoviesNames.value == null) {
            _allMoviesNames.postValue(names)
        }else {
            _allMoviesNames.postValue(names.plus(allMoviesNames.value!!))
        }

    }
}

}