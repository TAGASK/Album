package com.flemieux.deezeralbum.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {

    @SerializedName("data")
    @Expose
    var albums: List<Album>? = null
    @SerializedName("checksum")
    @Expose
    var checksum: String? = null
    @SerializedName("total")
    @Expose
    var total: Int = 0
    @SerializedName("next")
    @Expose
    var next: String? = null


}
