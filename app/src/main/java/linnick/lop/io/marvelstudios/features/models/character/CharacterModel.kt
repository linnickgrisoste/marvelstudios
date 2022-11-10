package linnick.lop.io.marvelstudios.features.models.character

import com.google.gson.annotations.SerializedName
import linnick.lop.io.marvelstudios.features.models.ThumbnailModel
import java.io.Serializable

data class CharacterModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("thumbnail") val thumbnail: ThumbnailModel
): Serializable
