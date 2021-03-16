package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AppinviteService (
    @SerializedName("status")
    var status: Long? = null,

    @SerializedName("other_platform_oauth_client")
    var otherPlatformOauthClient: List<String>? = null
):Parcelable