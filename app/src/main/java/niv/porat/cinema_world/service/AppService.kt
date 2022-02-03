package niv.porat.movie_world_project.service


import niv.porat.cinema_world.BuildConfig
import niv.porat.movie_world_project.models.MoviePopularResult
import niv.porat.movie_world_project.models.MovieRatedResult
import niv.porat.movie_world_project.models.TvPopularResult
import niv.porat.movie_world_project.models.TvRatedResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query



interface AppService {
    @GET("movie/popular")
    suspend fun getMovies(
        @Query("api_key") api_key:String = API_KEY,
        @Query("page") page:Int = 1
    ):MoviePopularResult

    @GET("movie/top_rated")
    suspend fun getMoviesRated(
        @Query("api_key") api_key:String =API_KEY,
        @Query("page") page:Int = 1
    ): MovieRatedResult


    @GET("tv/popular")
    suspend fun getTvPopular(
        @Query("api_key") api_key:String = API_KEY,
        @Query("page") page:Int = 1
    ):TvPopularResult

    @GET("tv/top_rated")
    suspend fun getTvRated(
        @Query("api_key") api_key:String = API_KEY,
        @Query("page") page:Int = 1

    ):TvRatedResult



    companion object{
        fun create():AppService{
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(AppService::class.java)
        }
        private const val BASE_URL = BuildConfig.TMBD_BASE_URL
        private const val API_KEY = BuildConfig.TMBD_API_KEY
    }
}