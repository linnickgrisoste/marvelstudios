package linnick.lop.io.marvelstudios.features.models.comic

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ComicDataContainerModel(
    @SerializedName("results") val result: List<ComicModel>
): Serializable
