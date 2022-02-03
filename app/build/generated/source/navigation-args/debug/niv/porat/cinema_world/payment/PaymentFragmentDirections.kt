package niv.porat.cinema_world.payment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import niv.porat.cinema_world.R

public class PaymentFragmentDirections private constructor() {
  public companion object {
    public fun actionPaymentFragmentToNavigationHome(): NavDirections =
        ActionOnlyNavDirections(R.id.action_paymentFragment_to_navigation_home)
  }
}
