package com.flemieux.deezeralbum.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Album {

    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("link")
    @Expose
    var link: String? = null
    @SerializedName("cover")
    @Expose
    var cover: String? = null
    @SerializedName("cover_small")
    @Expose
    var coverSmall: String? = null
    @SerializedName("cover_medium")
    @Expose
    var coverMedium: String? = null
    @SerializedName("cover_big")
    @Expose
    var coverBig: String? = null
    @SerializedName("cover_xl")
    @Expose
    var coverXl: String? = null
    @SerializedName("nb_tracks")
    @Expose
    var nbTracks: Int = 0
    @SerializedName("release_date")
    @Expose
    var releaseDate: String? = null
    @SerializedName("record_type")
    @Expose
    var recordType: String? = null
    @SerializedName("available")
    @Expose
    var isAvailable: Boolean = false
    @SerializedName("tracklist")
    @Expose
    var tracklist: String? = null
    @SerializedName("explicit_lyrics")
    @Expose
    var isExplicitLyrics: Boolean = false
    @SerializedName("time_add")
    @Expose
    var timeAdd: Int = 0
    @SerializedName("artist")
    @Expose
    var artist: Artist? = null
    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("alternative")
    @Expose
    var alternative: Alternative? = null
}
