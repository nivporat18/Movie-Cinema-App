package niv.porat.movie_world_project.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ%\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lniv/porat/movie_world_project/service/AppService;", "", "getMovies", "Lniv/porat/movie_world_project/models/MoviePopularResult;", "api_key", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesRated", "Lniv/porat/movie_world_project/models/MovieRatedResult;", "getTvPopular", "Lniv/porat/movie_world_project/models/TvPopularResult;", "getTvRated", "Lniv/porat/movie_world_project/models/TvRatedResult;", "Companion", "app_debug"})
public abstract interface AppService {
    @org.jetbrains.annotations.NotNull()
    public static final niv.porat.movie_world_project.service.AppService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/popular")
    public abstract java.lang.Object getMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super niv.porat.movie_world_project.models.MoviePopularResult> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/top_rated")
    public abstract java.lang.Object getMoviesRated(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super niv.porat.movie_world_project.models.MovieRatedResult> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tv/popular")
    public abstract java.lang.Object getTvPopular(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super niv.porat.movie_world_project.models.TvPopularResult> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tv/top_rated")
    public abstract java.lang.Object getTvRated(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super niv.porat.movie_world_project.models.TvRatedResult> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lniv/porat/movie_world_project/service/AppService$Companion;", "", "()V", "API_KEY", "", "BASE_URL", "create", "Lniv/porat/movie_world_project/service/AppService;", "app_debug"})
    public static final class Companion {
        private static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
        private static final java.lang.String API_KEY = "27715af1593b0426691060d9f7ad58ee";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final niv.porat.movie_world_project.service.AppService create() {
            return null;
        }
    }
}