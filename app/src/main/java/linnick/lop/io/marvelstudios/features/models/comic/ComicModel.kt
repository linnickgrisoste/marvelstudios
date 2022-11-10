package linnick.lop.io.marvelstudios.features.models.comic

import com.google.gson.annotations.SerializedName
import linnick.lop.io.marvelstudios.features.models.ThumbnailModel
import java.io.Serializable

data class ComicModel(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("thumbnail") val thumbnail: ThumbnailModel
): Serializable
