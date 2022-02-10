package niv.porat.cinema_world.viewpager

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import niv.porat.cinema_world.MainActivity
import niv.porat.cinema_world.adapter.SliderPagesAdapter
import niv.porat.cinema_world.R
import niv.porat.cinema_world.login.AuthActivity


// 3 Pages screens that give the user to understand what will be in the  app

class OnBoarding : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var viewPagerAdapter: SliderPagesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        val relativeLayout = findViewById<RelativeLayout>(R.id.relativ1)
        val dotsIndicator = findViewById<DotsIndicator>(R.id.dots_indicator)
        val btn_continue = findViewById<Button>(R.id.btn_continue)

        val animationDrawable = relativeLayout.background as AnimationDrawable
        addAnimation(animationDrawable)

        viewPager = findViewById(R.id.viewpager)
        viewPagerAdapter = SliderPagesAdapter(this)
        viewPager.adapter = viewPagerAdapter

        dotsIndicator.setViewPager(viewPager)

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int,
            ) {

            }

            override fun onPageSelected(position: Int) {
                Log.i("Tag", position.toString())
                if (position == 0) {
                    relativeLayout.setBackgroundResource(R.drawable.gradient_animation123)
                    val animationDrawable = relativeLayout.background as AnimationDrawable
                    addAnimation(animationDrawable)
                }
                if (position == 1) {
                    relativeLayout.setBackgroundResource(R.drawable.gradient_animation123)
                    val animationDrawable = relativeLayout.background as AnimationDrawable
                    addAnimation(animationDrawable)
                }
                if (position == 2) {
                    relativeLayout.setBackgroundResource(R.drawable.gradient_animation123)
                    val animationDrawable = relativeLayout.background as AnimationDrawable
                    addAnimation(animationDrawable)
                }
                if (position == 3) {
                    relativeLayout.setBackgroundResource(R.drawable.gradient_animation123)
                    val animationDrawable = relativeLayout.background as AnimationDrawable
                    addAnimation(animationDrawable)
                    btn_continue.visibility = View.VISIBLE

                    btn_continue.setOnClickListener {
                        startActivity(Intent(this@OnBoarding, AuthActivity::class.java))
                    }

                }
            }

            override fun onPageScrollStateChanged(state: Int) {
            }

        })



    }


    fun addAnimation(animationDrawable: AnimationDrawable) {
        animationDrawable.setExitFadeDuration(2500)
        animationDrawable.setExitFadeDuration(1000)
        animationDrawable.start()
    }

}