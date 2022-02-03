package niv.porat.cinema_world.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import niv.porat.cinema_world.firebase.AppRealTimeDatabase
import niv.porat.cinema_world.models.Favorite
import niv.porat.movie_world_project.models.*
import niv.porat.movie_world_project.service.AppService

class AppRepository {

    companion object {
        suspend fun getMovies(): List<MoviePopular> {
            return withContext(Dispatchers.IO) {
                val movieResult = AppService.create().getMovies()
                movieResult.results
            }
        }

        suspend fun getMovieRated(): List<MovieRated> {
            return withContext(Dispatchers.IO) {
                val movieRatedResult = AppService.create().getMoviesRated()
                movieRatedResult.results
            }
        }


        suspend fun getTvPopular(): List<TvPopular> {
            return withContext(Dispatchers.IO) {
                val tvPopular = AppService.create().getTvPopular()
                tvPopular.results
            }
        }


        suspend fun getTvRated(): List<TvRated> {
            return withContext(Dispatchers.IO) {
                val tvPopular = AppService.create().getTvRated()
                tvPopular.results
            }
        }
        private val favorite: MutableLiveData<List<Favorite>> = MutableLiveData()
        val favoriteLiveData: LiveData<List<Favorite>> get() = favorite

        fun fetchFavoriteFromFirebase(){
            AppRealTimeDatabase.getRoot().child(FirebaseAuth.getInstance().currentUser!!.uid)
                .child("favorite").addValueEventListener(object :ValueEventListener{
                    override fun onDataChange(snapshot: DataSnapshot) {
                        val favorites = snapshot.children.mapNotNull {
                            it.getValue(Favorite::class.java)
                        }

                        favorite.postValue(favorites)
                    }

                    override fun onCancelled(error: DatabaseError) {
                        println(error.message)
                    }

                })
        }

    }


    //firebase -לגשת לנתיבים

    private val ref: DatabaseReference =
        AppRealTimeDatabase.getRoot().child(FirebaseAuth.getInstance().currentUser!!.uid)
            .child("favorite")





    private val _error = MutableLiveData<Exception>()
    val error: LiveData<Exception> get() = _error

    private val _status = MutableLiveData<String>()
    val status: LiveData<String> get() = _status



    fun addToFavorite(favorite: Favorite) {
        AppRealTimeDatabase.getRoot().child(FirebaseAuth.getInstance().currentUser!!.uid)
            .child("favorite").push().setValue(favorite)
    }


    fun deleteFromFavorite(name: String) {
        ref.get().addOnSuccessListener {
            val foundFavorite = it.children.find { remove ->
                remove.child("title").value!! == name
            }
            foundFavorite?.ref?.removeValue()
            if (foundFavorite == null) {
                println(name)
            }
        }
    }

}