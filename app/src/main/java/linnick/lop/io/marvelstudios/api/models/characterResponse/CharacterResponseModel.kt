package linnick.lop.io.marvelstudios.api.models.characterResponse

import com.google.gson.annotations.SerializedName
import linnick.lop.io.marvelstudios.features.models.character.CharacterDataContainerModel
import java.io.Serializable

data class CharacterResponseModel(
    @SerializedName("data")
    val data: CharacterDataContainerModel
): Serializable
