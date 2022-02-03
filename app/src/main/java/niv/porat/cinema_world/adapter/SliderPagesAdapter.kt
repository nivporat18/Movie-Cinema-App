package niv.porat.cinema_world.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import niv.porat.cinema_world.R

class SliderPagesAdapter(val context: Context) : PagerAdapter() {


    var layoutInflater: LayoutInflater? = null


    val imageArray = listOf(
        R.drawable.pager_ticket,
        R.drawable.pager_movie,
        R.drawable.pager_tvshow,
        R.drawable.pager_favorite
    )

    val headingsArray = listOf(
        R.string.first_slide_title,
        R.string.second_slide_title,
        R.string.third_slide_title,
        R.string.fourth_slide_title,
    )


    val descriptionsArray = listOf(
        R.string.first_slide_desc,
        R.string.second_slide_desc,
        R.string.third_slide_desc,
        R.string.fourth_slide_desc,
    )

    override fun getCount(): Int {
        return headingsArray.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as RelativeLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view = layoutInflater!!.inflate(R.layout.slide_layout,container,false)

        val image =view.findViewById<ImageView>(R.id.image_pager)
        val heading =view.findViewById<TextView>(R.id.txt_head)
        val desc =view.findViewById<TextView>(R.id.txt_description)

            image.setImageResource(imageArray[position])
            heading.setText(headingsArray[position])
            desc.setText(descriptionsArray[position])

        container.addView(view)

        return view

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as RelativeLayout)
    }
}