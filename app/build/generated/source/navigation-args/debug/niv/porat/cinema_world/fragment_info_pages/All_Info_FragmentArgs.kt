package niv.porat.cinema_world.fragment_info_pages

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

public data class All_Info_FragmentArgs(
  public val productPhotoArgument: String,
  public val productTitleArgument: String,
  public val productOverViewArgument: String,
  public val productDateArgument: String,
  public val productRetingArgument: Float,
  public val movieId: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("productPhotoArgument", this.productPhotoArgument)
    result.putString("productTitleArgument", this.productTitleArgument)
    result.putString("productOverViewArgument", this.productOverViewArgument)
    result.putString("productDateArgument", this.productDateArgument)
    result.putFloat("productRetingArgument", this.productRetingArgument)
    result.putInt("movieId", this.movieId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): All_Info_FragmentArgs {
      bundle.setClassLoader(All_Info_FragmentArgs::class.java.classLoader)
      val __productPhotoArgument : String?
      if (bundle.containsKey("productPhotoArgument")) {
        __productPhotoArgument = bundle.getString("productPhotoArgument")
        if (__productPhotoArgument == null) {
          throw IllegalArgumentException("Argument \"productPhotoArgument\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productPhotoArgument\" is missing and does not have an android:defaultValue")
      }
      val __productTitleArgument : String?
      if (bundle.containsKey("productTitleArgument")) {
        __productTitleArgument = bundle.getString("productTitleArgument")
        if (__productTitleArgument == null) {
          throw IllegalArgumentException("Argument \"productTitleArgument\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productTitleArgument\" is missing and does not have an android:defaultValue")
      }
      val __productOverViewArgument : String?
      if (bundle.containsKey("productOverViewArgument")) {
        __productOverViewArgument = bundle.getString("productOverViewArgument")
        if (__productOverViewArgument == null) {
          throw IllegalArgumentException("Argument \"productOverViewArgument\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productOverViewArgument\" is missing and does not have an android:defaultValue")
      }
      val __productDateArgument : String?
      if (bundle.containsKey("productDateArgument")) {
        __productDateArgument = bundle.getString("productDateArgument")
        if (__productDateArgument == null) {
          throw IllegalArgumentException("Argument \"productDateArgument\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productDateArgument\" is missing and does not have an android:defaultValue")
      }
      val __productRetingArgument : Float
      if (bundle.containsKey("productRetingArgument")) {
        __productRetingArgument = bundle.getFloat("productRetingArgument")
      } else {
        throw IllegalArgumentException("Required argument \"productRetingArgument\" is missing and does not have an android:defaultValue")
      }
      val __movieId : Int
      if (bundle.containsKey("movieId")) {
        __movieId = bundle.getInt("movieId")
      } else {
        throw IllegalArgumentException("Required argument \"movieId\" is missing and does not have an android:defaultValue")
      }
      return All_Info_FragmentArgs(__productPhotoArgument, __productTitleArgument,
          __productOverViewArgument, __productDateArgument, __productRetingArgument, __movieId)
    }
  }
}
