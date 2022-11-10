package linnick.lop.io.marvelstudios.features.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ThumbnailModel(
    @SerializedName("path") val path: String,
    @SerializedName("extension") val extension: String
): Serializable
