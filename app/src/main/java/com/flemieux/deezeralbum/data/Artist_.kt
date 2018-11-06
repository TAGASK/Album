package com.flemieux.deezeralbum.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Artist_ {

    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("picture")
    @Expose
    var picture: String? = null
    @SerializedName("picture_small")
    @Expose
    var pictureSmall: String? = null
    @SerializedName("picture_medium")
    @Expose
    var pictureMedium: String? = null
    @SerializedName("picture_big")
    @Expose
    var pictureBig: String? = null
    @SerializedName("picture_xl")
    @Expose
    var pictureXl: String? = null
    @SerializedName("tracklist")
    @Expose
    var tracklist: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null
}
