package niv.porat.cinema_world.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lniv/porat/cinema_world/adapter/FavoriteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lniv/porat/cinema_world/adapter/FavoriteAdapter$VH;", "favorite", "", "Lniv/porat/cinema_world/models/Favorite;", "clickRemove", "Lniv/porat/cinema_world/adapter/clickRemove;", "(Ljava/util/List;Lniv/porat/cinema_world/adapter/clickRemove;)V", "getClickRemove", "()Lniv/porat/cinema_world/adapter/clickRemove;", "getFavorite", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "VH", "app_release"})
public final class FavoriteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<niv.porat.cinema_world.adapter.FavoriteAdapter.VH> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<niv.porat.cinema_world.models.Favorite> favorite = null;
    @org.jetbrains.annotations.NotNull()
    private final niv.porat.cinema_world.adapter.clickRemove clickRemove = null;
    
    public FavoriteAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<niv.porat.cinema_world.models.Favorite> favorite, @org.jetbrains.annotations.NotNull()
    niv.porat.cinema_world.adapter.clickRemove clickRemove) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<niv.porat.cinema_world.models.Favorite> getFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final niv.porat.cinema_world.adapter.clickRemove getClickRemove() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public niv.porat.cinema_world.adapter.FavoriteAdapter.VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    niv.porat.cinema_world.adapter.FavoriteAdapter.VH holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lniv/porat/cinema_world/adapter/FavoriteAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lniv/porat/cinema_world/databinding/FavoriteItemBinding;", "(Lniv/porat/cinema_world/adapter/FavoriteAdapter;Lniv/porat/cinema_world/databinding/FavoriteItemBinding;)V", "getBinding", "()Lniv/porat/cinema_world/databinding/FavoriteItemBinding;", "app_release"})
    public final class VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final niv.porat.cinema_world.databinding.FavoriteItemBinding binding = null;
        
        public VH(@org.jetbrains.annotations.NotNull()
        niv.porat.cinema_world.databinding.FavoriteItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final niv.porat.cinema_world.databinding.FavoriteItemBinding getBinding() {
            return null;
        }
    }
}