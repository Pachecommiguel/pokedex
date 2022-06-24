package com.example.data.responses.generated

import com.google.gson.annotations.SerializedName


data class GenerationIII (

  @SerializedName("emerald"           ) var emerald           : Emerald?           = Emerald(),
  @SerializedName("firered-leafgreen" ) var fireredLeafgreen : FireredLeafgreen? = FireredLeafgreen(),
  @SerializedName("ruby-sapphire"     ) var rubySapphire     : RubySapphire?     = RubySapphire()

)