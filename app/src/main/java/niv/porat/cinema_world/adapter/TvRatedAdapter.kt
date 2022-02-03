package niv.porat.cinema_world.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import niv.porat.cinema_world.databinding.SlideItemBinding
import niv.porat.cinema_world.ui.dashboard.DashboardFragmentDirections
import niv.porat.cinema_world.ui.tv.TvFragmentDirections
import niv.porat.movie_world_project.models.MovieRated
import niv.porat.movie_world_project.models.TvRated

class TvRatedAdapter(val tvRated:List<TvRated>,val callback:(TvRated)->Unit):RecyclerView.Adapter<TvRatedAdapter.VH>() {

    inner class VH(val binding:SlideItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            SlideItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val tr = tvRated[position]

        holder.binding.apply {
            Picasso.get().load("$IMAGE${tr.poster}").into(imageSlide)
            title.text = tr.title
        }

        holder.binding.imageSlide.setOnClickListener {
            callback(tr)
            val action = TvFragmentDirections.actionTvFragmentToAllInfoFragment("$IMAGE${tr.poster}",tr.title.toString(),tr.overview.toString(),"",tr.rating!!.toFloat() /2,tr.id)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return tvRated.size
    }

}