package niv.porat.cinema_world.splashscreen

import android.content.Context
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.constraintlayout.widget.ConstraintLayout
import niv.porat.cinema_world.MainActivity
import niv.porat.cinema_world.R
import niv.porat.cinema_world.viewpager.OnBoarding

class SplashScreenActivity : AppCompatActivity() {

    private val splash_time: Long = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Handler().postDelayed({
            if (getSharedPreferences("pref", Context.MODE_PRIVATE).getBoolean("ifTheFirstTime",
                    false)
            ) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                getSharedPreferences("pref", Context.MODE_PRIVATE).edit()
                    .putBoolean("ifTheFirstTime", true).apply()
                startActivity(Intent(this, OnBoarding::class.java))
                finish()

            }

        }, splash_time)
    }


}