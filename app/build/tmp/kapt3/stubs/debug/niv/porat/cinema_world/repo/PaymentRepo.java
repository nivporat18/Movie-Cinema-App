package niv.porat.cinema_world.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0017R\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lniv/porat/cinema_world/repo/PaymentRepo;", "", "()V", "_error", "Landroidx/lifecycle/MutableLiveData;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_payment", "", "Lniv/porat/cinema_world/models/Payment;", "_status", "", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "payment", "getPayment", "ref", "Lcom/google/firebase/database/DatabaseReference;", "status", "getStatus", "addToPayment", "", "fetchPaymentFromFirebase", "app_debug"})
public final class PaymentRepo {
    private final androidx.lifecycle.MutableLiveData<java.util.List<niv.porat.cinema_world.models.Payment>> _payment = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> _error = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _status = null;
    private final com.google.firebase.database.DatabaseReference ref = null;
    
    public PaymentRepo() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<niv.porat.cinema_world.models.Payment>> getPayment() {
        return null;
    }
    
    public final void fetchPaymentFromFirebase() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Exception> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getStatus() {
        return null;
    }
    
    public final void addToPayment(@org.jetbrains.annotations.NotNull()
    niv.porat.cinema_world.models.Payment payment) {
    }
}