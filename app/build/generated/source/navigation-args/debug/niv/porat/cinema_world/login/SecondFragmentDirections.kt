package niv.porat.cinema_world.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import niv.porat.cinema_world.R

public class SecondFragmentDirections private constructor() {
  public companion object {
    public fun actionSecondFragmentToFirstFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_SecondFragment_to_FirstFragment)
  }
}
