package niv.porat.cinema_world.models

data class Payment(
    val name: String = "",
    val totalPrice:Int = 0,
    val cardNumber:String = "",
    val cvv: String = "",
    val expiry: String = "",
)