package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OauthClient (
    @SerializedName("client_id")
    var clientID: String? = null,

    @SerializedName("client_type")
    var clientType: Long? = null
): Parcelable