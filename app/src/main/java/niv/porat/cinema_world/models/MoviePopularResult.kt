package niv.porat.movie_world_project.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

import java.util.*

data class MoviePopularResult(
    val page: Int ,
    val results: List<MoviePopular>,
)

@Entity(tableName = "MoviePopular")
data class MoviePopular(

    @PrimaryKey
    val id: Int ,

    @ColumnInfo(name = "title")
    val original_title: String?,

    @ColumnInfo
    val overview: String? ,

    @ColumnInfo(name = "poster")
    val poster_path: String? ,

    @ColumnInfo(name = "date")
    val release_date: String?,

    @ColumnInfo(name = "average")
    val vote_average: Double?,

    @ColumnInfo(name = "language")
    val original_language: String?,
)