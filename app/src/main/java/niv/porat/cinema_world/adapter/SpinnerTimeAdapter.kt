package niv.porat.cinema_world.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import niv.porat.cinema_world.R

class SpinnerTimeAdapter(private val time:List<String>):BaseAdapter() {

    inner class ViewHolder {
        var timeLabel: TextView? = null
    }

    override fun getCount(): Int {
        return time.size
    }

    override fun getItem(p0: Int): Any {
        return time[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView

        val holder:SpinnerTimeAdapter.ViewHolder?

        if (convertView == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.spinner_item, parent, false)
            holder = ViewHolder()
            holder.timeLabel = view.findViewById(R.id.item_text)
            view.tag = holder
        } else {
            holder = convertView.tag as SpinnerTimeAdapter.ViewHolder
        }

        holder.timeLabel?.text = time[position]

        return view!!
    }


}