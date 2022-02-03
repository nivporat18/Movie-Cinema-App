package niv.porat.movie_world_project.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class MovieRatedResult(
    val page: Int ,
    val results: List<MovieRated>,
)

@Entity(tableName = "MovieRated")
data class MovieRated(
    @PrimaryKey
    val id: Int ,

    @ColumnInfo
    val title: String?,

    @ColumnInfo
    val overview: String?,

    @ColumnInfo(name = "date")
    val release_date: String?,

    @ColumnInfo(name = "poster")
    val poster_path: String?,

    @ColumnInfo(name = "average")
    val vote_average: Double?,

    @ColumnInfo(name = "language")
    val original_language: String?,
)