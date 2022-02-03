package niv.porat.cinema_world.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lniv/porat/cinema_world/payment/PaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "Companion", "app_debug"})
public final class PaymentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    public static final niv.porat.cinema_world.payment.PaymentViewModel.Companion Companion = null;
    private static final niv.porat.cinema_world.repo.PaymentRepo paymentRepository = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.LiveData<java.util.List<niv.porat.cinema_world.models.Payment>> appLiveData = null;
    
    public PaymentViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lniv/porat/cinema_world/payment/PaymentViewModel$Companion;", "", "()V", "appLiveData", "Landroidx/lifecycle/LiveData;", "", "Lniv/porat/cinema_world/models/Payment;", "getAppLiveData", "()Landroidx/lifecycle/LiveData;", "paymentRepository", "Lniv/porat/cinema_world/repo/PaymentRepo;", "addToPayment", "", "payment", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<java.util.List<niv.porat.cinema_world.models.Payment>> getAppLiveData() {
            return null;
        }
        
        public final void addToPayment(@org.jetbrains.annotations.NotNull()
        niv.porat.cinema_world.models.Payment payment) {
        }
    }
}