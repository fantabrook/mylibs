package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Client (
    @SerializedName("client_info")
    var clientInfo: ClientInfo? = null,

    @SerializedName("oauth_client")
    var oauthClient: List<OauthClient>? = null,

    @SerializedName("api_key")
    var apiKey: List<APIKey>? = null,

    @SerializedName("services")
    var services: Services? = null
): Parcelable