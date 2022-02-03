package niv.porat.cinema_world.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import niv.porat.cinema_world.databinding.FavoriteItemBinding
import niv.porat.cinema_world.models.Favorite
import niv.porat.cinema_world.ui.notifications.NotificationsViewModel

interface clickRemove{
    fun delete(favorite: Favorite)
}

//val listener:clickRemove
class FavoriteAdapter(val favorite: List<Favorite>,val clickRemove: clickRemove ):RecyclerView.Adapter<FavoriteAdapter.VH>() {
    inner class VH(val binding: FavoriteItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
       return VH(
           FavoriteItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
       )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val fav = favorite[position]

        holder.binding.apply {
            Picasso.get().load("$IMAGE${fav.poster}").into(imageSlide)
            title.text = fav.title

            btnRemove.setOnClickListener {
                clickRemove.delete(fav)
            }
        }

    }

    override fun getItemCount(): Int {
        return favorite.size
    }


}