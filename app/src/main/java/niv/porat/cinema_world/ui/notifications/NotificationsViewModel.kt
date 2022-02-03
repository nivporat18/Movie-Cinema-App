package niv.porat.cinema_world.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import niv.porat.cinema_world.firebase.AppRealTimeDatabase
import niv.porat.cinema_world.repo.AppRepository
import niv.porat.cinema_world.models.Favorite

class NotificationsViewModel : ViewModel() {

    companion object {
         private val favoriteRepository: AppRepository = AppRepository()

        val appLiveData: LiveData<List<Favorite>> = AppRepository.favoriteLiveData


        fun addFavorite(favorite: Favorite) {
            favoriteRepository.addToFavorite(favorite)
        }


        fun deleteFavorite(name:String) {
            favoriteRepository.deleteFromFavorite(name)
        }


    }
}


