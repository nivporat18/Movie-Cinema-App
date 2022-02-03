package niv.porat.movie_world_project.utils

import android.app.Activity
import android.util.Patterns
import android.view.inputmethod.InputMethodManager

fun CharSequence.isEmailValid():Boolean{
    return this.length >= 6  &&  Patterns.EMAIL_ADDRESS.matcher(this).matches()
}


fun hideKeyboard(activity: Activity){

    val imm = activity.getSystemService(InputMethodManager::class.java)

    //which edittext
    imm.hideSoftInputFromWindow(activity.currentFocus?.windowToken, 0)
}
