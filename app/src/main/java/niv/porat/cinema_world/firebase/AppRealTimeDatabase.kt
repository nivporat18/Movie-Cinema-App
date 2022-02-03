package niv.porat.cinema_world.firebase

import com.google.firebase.database.FirebaseDatabase

class AppRealTimeDatabase {
    companion object{
        fun getRoot() = FirebaseDatabase.getInstance().reference
    }
}