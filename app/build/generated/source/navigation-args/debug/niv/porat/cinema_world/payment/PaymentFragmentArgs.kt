package niv.porat.cinema_world.payment

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class PaymentFragmentArgs(
  public val ticket: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("ticket", this.ticket)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PaymentFragmentArgs {
      bundle.setClassLoader(PaymentFragmentArgs::class.java.classLoader)
      val __ticket : String?
      if (bundle.containsKey("ticket")) {
        __ticket = bundle.getString("ticket")
        if (__ticket == null) {
          throw IllegalArgumentException("Argument \"ticket\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"ticket\" is missing and does not have an android:defaultValue")
      }
      return PaymentFragmentArgs(__ticket)
    }
  }
}
