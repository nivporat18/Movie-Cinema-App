package niv.porat.cinema_world.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import niv.porat.cinema_world.R

public class FirstFragmentDirections private constructor() {
  public companion object {
    public fun actionFirstFragmentToSecondFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_FirstFragment_to_SecondFragment)

    public fun actionFirstFragmentToForgetPasswordFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_FirstFragment_to_forget_Password_Fragment)
  }
}
