package linnick.lop.io.marvelstudios.api.models.comicResponse

import com.google.gson.annotations.SerializedName
import linnick.lop.io.marvelstudios.features.models.comic.ComicDataContainerModel
import java.io.Serializable

data class ComicResponseModel(
    @SerializedName("data")
    val data: ComicDataContainerModel
): Serializable
