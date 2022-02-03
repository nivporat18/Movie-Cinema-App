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
import niv.porat.movie_world_project.models.TvPopular

class TvPopularAdapter(val tvPopular:List<TvPopular>,val callback:(TvPopular)->Unit):RecyclerView.Adapter<TvPopularAdapter.VH>() {

    inner class VH(val binding: SlideItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            SlideItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val tp = tvPopular[position]

        holder.binding.apply {
            Picasso.get().load("$IMAGE${tp.poster}").into(imageSlide)
            title.text = tp.title
        }

        holder.binding.imageSlide.setOnClickListener {
            callback(tp)
            val action = TvFragmentDirections.actionTvFragmentToAllInfoFragment("$IMAGE${tp.poster}",tp.title.toString(),tp.overview.toString(),"",tp.rating!!.toFloat() /2,tp.id)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return tvPopular.size
    }
}