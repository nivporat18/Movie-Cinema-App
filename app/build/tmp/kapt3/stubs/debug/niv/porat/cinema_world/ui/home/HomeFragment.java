package niv.porat.cinema_world.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u0018\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J$\u0010)\u001a\u00020*2\u0006\u0010\'\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020 H\u0016J\b\u00101\u001a\u00020 H\u0016J\u001a\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00064"}, d2 = {"Lniv/porat/cinema_world/ui/home/HomeFragment;", "Lniv/porat/cinema_world/utils/ProgressFragment;", "()V", "_binding", "Lniv/porat/cinema_world/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lniv/porat/cinema_world/databinding/FragmentHomeBinding;", "homeViewModel", "Lniv/porat/cinema_world/ui/home/HomeViewModel;", "spinnerLocation", "Landroid/widget/Spinner;", "getSpinnerLocation", "()Landroid/widget/Spinner;", "setSpinnerLocation", "(Landroid/widget/Spinner;)V", "spinnerMovie", "getSpinnerMovie", "setSpinnerMovie", "spinnerTicket", "getSpinnerTicket", "setSpinnerTicket", "spinnerTime", "getSpinnerTime", "setSpinnerTime", "ticket", "Lniv/porat/cinema_world/models/Ticket;", "getTicket", "()Lniv/porat/cinema_world/models/Ticket;", "setTicket", "(Lniv/porat/cinema_world/models/Ticket;)V", "addObservers", "", "doTransition", "result", "Lniv/porat/cinema_world/SearchResult;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onViewCreated", "view", "app_debug"})
public final class HomeFragment extends niv.porat.cinema_world.utils.ProgressFragment {
    private niv.porat.cinema_world.ui.home.HomeViewModel homeViewModel;
    private niv.porat.cinema_world.databinding.FragmentHomeBinding _binding;
    public android.widget.Spinner spinnerLocation;
    public android.widget.Spinner spinnerTime;
    public android.widget.Spinner spinnerTicket;
    public android.widget.Spinner spinnerMovie;
    @org.jetbrains.annotations.NotNull()
    private niv.porat.cinema_world.models.Ticket ticket;
    private java.util.HashMap _$_findViewCache;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getSpinnerLocation() {
        return null;
    }
    
    public final void setSpinnerLocation(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getSpinnerTime() {
        return null;
    }
    
    public final void setSpinnerTime(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getSpinnerTicket() {
        return null;
    }
    
    public final void setSpinnerTicket(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getSpinnerMovie() {
        return null;
    }
    
    public final void setSpinnerMovie(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final niv.porat.cinema_world.models.Ticket getTicket() {
        return null;
    }
    
    public final void setTicket(@org.jetbrains.annotations.NotNull()
    niv.porat.cinema_world.models.Ticket p0) {
    }
    
    private final niv.porat.cinema_world.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void doTransition(@org.jetbrains.annotations.NotNull()
    niv.porat.cinema_world.SearchResult result) {
    }
    
    public final void addObservers() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}