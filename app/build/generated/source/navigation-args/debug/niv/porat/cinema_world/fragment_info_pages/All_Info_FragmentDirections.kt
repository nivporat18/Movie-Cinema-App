package niv.porat.cinema_world.fragment_info_pages

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import niv.porat.cinema_world.R

public class All_Info_FragmentDirections private constructor() {
  public companion object {
    public fun actionAllInfoFragmentToNavigationFavorite(): NavDirections =
        ActionOnlyNavDirections(R.id.action_all_Info_Fragment_to_navigation_favorite)
  }
}
