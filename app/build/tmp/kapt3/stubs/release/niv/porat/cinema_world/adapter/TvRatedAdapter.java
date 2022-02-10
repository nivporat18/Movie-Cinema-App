package niv.porat.cinema_world.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lniv/porat/cinema_world/adapter/TvRatedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lniv/porat/cinema_world/adapter/TvRatedAdapter$VH;", "tvRated", "", "Lniv/porat/movie_world_project/models/TvRated;", "callback", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getTvRated", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "VH", "app_release"})
public final class TvRatedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<niv.porat.cinema_world.adapter.TvRatedAdapter.VH> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<niv.porat.movie_world_project.models.TvRated> tvRated = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<niv.porat.movie_world_project.models.TvRated, kotlin.Unit> callback = null;
    
    public TvRatedAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<niv.porat.movie_world_project.models.TvRated> tvRated, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super niv.porat.movie_world_project.models.TvRated, kotlin.Unit> callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<niv.porat.movie_world_project.models.TvRated> getTvRated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<niv.porat.movie_world_project.models.TvRated, kotlin.Unit> getCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public niv.porat.cinema_world.adapter.TvRatedAdapter.VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    niv.porat.cinema_world.adapter.TvRatedAdapter.VH holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lniv/porat/cinema_world/adapter/TvRatedAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lniv/porat/cinema_world/databinding/SlideItemBinding;", "(Lniv/porat/cinema_world/adapter/TvRatedAdapter;Lniv/porat/cinema_world/databinding/SlideItemBinding;)V", "getBinding", "()Lniv/porat/cinema_world/databinding/SlideItemBinding;", "app_release"})
    public final class VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final niv.porat.cinema_world.databinding.SlideItemBinding binding = null;
        
        public VH(@org.jetbrains.annotations.NotNull()
        niv.porat.cinema_world.databinding.SlideItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final niv.porat.cinema_world.databinding.SlideItemBinding getBinding() {
            return null;
        }
    }
}