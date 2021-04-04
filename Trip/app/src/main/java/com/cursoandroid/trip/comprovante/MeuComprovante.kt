package com.cursoandroid.trip.comprovante

import com.google.gson.annotations.SerializedName

data class MeuComprovante(

    @SerializedName("mandatory_all_receipts_fields")
    var mandatoryAllReceiptsFields: MandatoryAllReceiptsFields? = null
)

data class MandatoryAllReceiptsFields(

    @SerializedName("getnetLogo")
    var getnetLogo: String ? = null,
    @SerializedName("city")
    var city: String? = null,
    @SerializedName("valorFinal")
    var valorFinal: String? = null,
    @SerializedName("type")
    var type: String? = null
)