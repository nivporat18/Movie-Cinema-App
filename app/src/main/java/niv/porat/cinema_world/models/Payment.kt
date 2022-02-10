package niv.porat.cinema_world.models

data class Payment(
    val name: String = "",
    val totalPrice:Int = 0,
    val time:String = "",
    val cinema:String = "",
    val ticket:String = ""
)