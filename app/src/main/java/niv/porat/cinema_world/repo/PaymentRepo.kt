package niv.porat.cinema_world.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import niv.porat.cinema_world.firebase.AppRealTimeDatabase
import niv.porat.cinema_world.models.Favorite
import niv.porat.cinema_world.models.Payment

class PaymentRepo {

    private val _payment: MutableLiveData<List<Payment>> = MutableLiveData()
    val payment: LiveData<List<Payment>> get() = _payment

    fun fetchPaymentFromFirebase(){
        AppRealTimeDatabase.getRoot().child(FirebaseAuth.getInstance().currentUser!!.uid)
            .child("payment").addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    val payments = snapshot.children.mapNotNull {
                        it.getValue(Payment::class.java)
                    }
                    _payment.postValue(payments)

                }

                override fun onCancelled(error: DatabaseError) {
                    println(error.message)
                }

            })
    }

    private val _error = MutableLiveData<Exception>()
    val error: LiveData<Exception> get() = _error

    private val _status = MutableLiveData<String>()
    val status: LiveData<String> get() = _status


    private val ref: DatabaseReference =
        AppRealTimeDatabase.getRoot().child(FirebaseAuth.getInstance().currentUser!!.uid)
            .child("payment")


    fun addToPayment(payment: Payment) {
        AppRealTimeDatabase.getRoot().child(FirebaseAuth.getInstance().currentUser!!.uid)
            .child("payment").push().setValue(payment)
    }


}