package niv.porat.cinema_world.ui.dashboard

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Float
import kotlin.Int
import kotlin.String
import niv.porat.cinema_world.R

public class DashboardFragmentDirections private constructor() {
  private data class ActionNavigationDashboardToAllInfoFragment(
    public val productPhotoArgument: String,
    public val productTitleArgument: String,
    public val productOverViewArgument: String,
    public val productDateArgument: String,
    public val productRetingArgument: Float,
    public val movieId: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_navigation_dashboard_to_all_Info_Fragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("productPhotoArgument", this.productPhotoArgument)
        result.putString("productTitleArgument", this.productTitleArgument)
        result.putString("productOverViewArgument", this.productOverViewArgument)
        result.putString("productDateArgument", this.productDateArgument)
        result.putFloat("productRetingArgument", this.productRetingArgument)
        result.putInt("movieId", this.movieId)
        return result
      }
  }

  public companion object {
    public fun actionNavigationDashboardToAllInfoFragment(
      productPhotoArgument: String,
      productTitleArgument: String,
      productOverViewArgument: String,
      productDateArgument: String,
      productRetingArgument: Float,
      movieId: Int
    ): NavDirections = ActionNavigationDashboardToAllInfoFragment(productPhotoArgument,
        productTitleArgument, productOverViewArgument, productDateArgument, productRetingArgument,
        movieId)
  }
}
