package niv.porat.movie_world_project.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class TvPopularResult(
    val page: Int ,
    val results: List<TvPopular>,
)

@Entity(tableName = "TvPopular")
data class TvPopular(
    @PrimaryKey
    val id: Int ,

    @ColumnInfo
    @SerializedName("original_name")
    val title:String?,

    @ColumnInfo
    val overview: String?,

    @ColumnInfo
    @SerializedName("poster_path")
    val poster: String?,

    @ColumnInfo
    @SerializedName("vote_average")
    val rating: Double?,

    @ColumnInfo
    @SerializedName("original_language")
    val language:String?
)