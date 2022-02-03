package niv.porat.cinema_world.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.BaseAdapter
import android.widget.TextView
import niv.porat.cinema_world.R
import niv.porat.cinema_world.models.Location
import org.w3c.dom.Text


class LocationAdapter(private val list: List<String>) : BaseAdapter() {

    inner class ViewHolder {
        var locationLabel: TextView? = null


    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView

        val holder: ViewHolder?

        if (convertView == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.spinner_item, parent, false)
            holder = ViewHolder()
            holder.locationLabel = view.findViewById(R.id.item_text)
            view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
        }

        holder.locationLabel?.text = list[position]

        return view!!

    }

    override fun getItem(position: Int): String {
        return list[position]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return list.size

    }
}