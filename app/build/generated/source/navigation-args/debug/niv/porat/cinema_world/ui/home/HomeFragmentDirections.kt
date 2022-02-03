package niv.porat.cinema_world.ui.home

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import niv.porat.cinema_world.R

public class HomeFragmentDirections private constructor() {
  private data class ActionNavigationHomeToPaymentFragment(
    public val ticket: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_navigation_home_to_paymentFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("ticket", this.ticket)
      return result
    }
  }

  public companion object {
    public fun actionNavigationHomeToNavigationDashboard(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_home_to_navigation_dashboard)

    public fun actionNavigationHomeToNavigationTvshow(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_home_to_navigation_tvshow)

    public fun actionNavigationHomeToPaymentFragment(ticket: String): NavDirections =
        ActionNavigationHomeToPaymentFragment(ticket)
  }
}
