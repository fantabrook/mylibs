package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ClientInfo (
    @SerializedName("mobilesdk_app_id")
    var mobilesdkAppID: String? = null,

    @SerializedName("android_client_info")
    var androidClientInfo: AndroidClientInfo? = null
): Parcelable