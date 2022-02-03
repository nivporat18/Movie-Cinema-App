package niv.porat.cinema_world.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import niv.porat.cinema_world.databinding.SlideItemBinding
import niv.porat.cinema_world.ui.dashboard.DashboardFragmentDirections
import niv.porat.movie_world_project.models.MoviePopular

const val IMAGE = "https://image.tmdb.org/t/p/w500"
class MoviePopularAdapter(val moviePopular:List<MoviePopular>,val callback:(MoviePopular)->Unit):RecyclerView.Adapter<MoviePopularAdapter.VH>() {

    inner class  VH(val binding:SlideItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(SlideItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
       val mp = moviePopular[position]

        holder.binding.apply {
            Picasso.get().load("$IMAGE${mp.poster_path}").into(imageSlide)
            title.text = mp.original_title
        }


       holder.binding.imageSlide.setOnClickListener {
           callback(mp)

           val action = DashboardFragmentDirections.actionNavigationDashboardToAllInfoFragment("$IMAGE${mp.poster_path}",mp.original_title.toString(),mp.overview.toString(),mp.release_date.toString(),mp.vote_average!!.toFloat() /2,mp.id)
           holder.itemView.findNavController().navigate(action)
       }

    }

    override fun getItemCount(): Int {
        return moviePopular.size
    }
}