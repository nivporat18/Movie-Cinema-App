package niv.porat.cinema_world.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import niv.porat.cinema_world.R
import niv.porat.cinema_world.models.Ticket

class TicketSpinnerAdapter(private val ticket: List<Int>) : BaseAdapter() {

    inner class ViewHolder {
        var ticketLabel: TextView? = null
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        var holder: ViewHolder? = null
        if (convertView == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.spinner_item, parent, false)
            holder = ViewHolder()
            holder.ticketLabel = view.findViewById(R.id.item_text)
            view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
        }
        holder.ticketLabel?.text = ticket[position].toString()
        return view!!

    }

    override fun getItem(position: Int): Int {
        return ticket[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    // size of list - Size
    override fun getCount(): Int {
        return ticket.size
    }

}

