package niv.porat.cinema_world.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import niv.porat.cinema_world.R
import niv.porat.cinema_world.models.Location

class SpinnerMovieAdapter(val movie:List<String>): BaseAdapter() {
    inner class ViewHolder {
        var movieabel: TextView? = null
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView

        val holder: ViewHolder?

        if (convertView == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.spinner_item, parent, false)
            holder = ViewHolder()
            holder.movieabel = view.findViewById(R.id.item_text)
            view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
        }

        holder.movieabel?.text = movie[position]

        return view!!

    }

    override fun getItem(position: Int): String {
        return movie[position]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return movie.size

    }
}