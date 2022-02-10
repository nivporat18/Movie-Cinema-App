package niv.porat.cinema_world.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\bR\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lniv/porat/cinema_world/repo/AppRepository;", "", "()V", "_error", "Landroidx/lifecycle/MutableLiveData;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_status", "", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "ref", "Lcom/google/firebase/database/DatabaseReference;", "status", "getStatus", "addToFavorite", "", "favorite", "Lniv/porat/cinema_world/models/Favorite;", "deleteFromFavorite", "name", "Companion", "app_release"})
public final class AppRepository {
    @org.jetbrains.annotations.NotNull()
    public static final niv.porat.cinema_world.repo.AppRepository.Companion Companion = null;
    private static final androidx.lifecycle.MutableLiveData<java.util.List<niv.porat.cinema_world.models.Favorite>> favorite = null;
    private final com.google.firebase.database.DatabaseReference ref = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> _error = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _status = null;
    
    public AppRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Exception> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getStatus() {
        return null;
    }
    
    public final void addToFavorite(@org.jetbrains.annotations.NotNull()
    niv.porat.cinema_world.models.Favorite favorite) {
    }
    
    public final void deleteFromFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lniv/porat/cinema_world/repo/AppRepository$Companion;", "", "()V", "favorite", "Landroidx/lifecycle/MutableLiveData;", "", "Lniv/porat/cinema_world/models/Favorite;", "favoriteLiveData", "Landroidx/lifecycle/LiveData;", "getFavoriteLiveData", "()Landroidx/lifecycle/LiveData;", "fetchFavoriteFromFirebase", "", "getMovieRated", "Lniv/porat/movie_world_project/models/MovieRated;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovies", "Lniv/porat/movie_world_project/models/MoviePopular;", "getTvPopular", "Lniv/porat/movie_world_project/models/TvPopular;", "getTvRated", "Lniv/porat/movie_world_project/models/TvRated;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getMovies(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<niv.porat.movie_world_project.models.MoviePopular>> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getMovieRated(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<niv.porat.movie_world_project.models.MovieRated>> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getTvPopular(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<niv.porat.movie_world_project.models.TvPopular>> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getTvRated(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<niv.porat.movie_world_project.models.TvRated>> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<java.util.List<niv.porat.cinema_world.models.Favorite>> getFavoriteLiveData() {
            return null;
        }
        
        public final void fetchFavoriteFromFirebase() {
        }
    }
}