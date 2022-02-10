package niv.porat.cinema_world.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import niv.porat.cinema_world.R

public class Forget_Password_FragmentDirections private constructor() {
  public companion object {
    public fun actionForgetPasswordFragmentToFirstFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_forget_Password_Fragment_to_FirstFragment)
  }
}
