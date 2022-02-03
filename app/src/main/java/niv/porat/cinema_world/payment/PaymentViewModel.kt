package niv.porat.cinema_world.payment

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import niv.porat.cinema_world.models.Favorite
import niv.porat.cinema_world.models.Payment
import niv.porat.cinema_world.repo.AppRepository
import niv.porat.cinema_world.repo.PaymentRepo

class PaymentViewModel : ViewModel() {
    companion object {
        private val paymentRepository: PaymentRepo = PaymentRepo()

        val appLiveData: LiveData<List<Payment>> = paymentRepository.payment


        fun addToPayment(payment: Payment) {
            paymentRepository.addToPayment(payment)
        }
    }
}