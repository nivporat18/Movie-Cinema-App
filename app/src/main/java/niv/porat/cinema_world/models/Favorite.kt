package niv.porat.cinema_world.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Favorite")
data class Favorite(
    @PrimaryKey
    val id:Int? = 0,
    @ColumnInfo
    val poster:String? = "",
    @ColumnInfo
    val title:String? = ""
)