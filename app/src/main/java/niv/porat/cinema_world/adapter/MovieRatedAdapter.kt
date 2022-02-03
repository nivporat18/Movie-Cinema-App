package niv.porat.cinema_world.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import niv.porat.cinema_world.databinding.SlideItemBinding
import niv.porat.cinema_world.ui.dashboard.DashboardFragmentDirections
import niv.porat.movie_world_project.models.MovieRated

class MovieRatedAdapter(val movieRated:List<MovieRated>,val callback:(MovieRated)->Unit):RecyclerView.Adapter<MovieRatedAdapter.VH>() {

    inner class VH(val binding: SlideItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
        SlideItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
      val mr = movieRated[position]

            holder.binding.apply {
                Picasso.get().load("$IMAGE${mr.poster_path}").into(imageSlide)
                title.text = mr.title
        }


        holder.binding.imageSlide.setOnClickListener {
            callback(mr)
            val action = DashboardFragmentDirections.actionNavigationDashboardToAllInfoFragment("$IMAGE${mr.poster_path}",mr.title.toString(),mr.overview.toString(),mr.release_date.toString(),mr.vote_average!!.toFloat() /2,mr.id)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return movieRated.size
    }


}