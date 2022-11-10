package linnick.lop.io.marvelstudios.features.models.character

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CharacterDataContainerModel(
    @SerializedName("results") val results: List<CharacterModel>
): Serializable
