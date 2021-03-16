package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Services (
    @SerializedName("analytics_service")
    var analyticsService: AnalyticsService? = null,

    @SerializedName("appinvite_service")
    var appinviteService: AppinviteService? = null,

    @SerializedName("ads_service")
    var adsService: AdsService? = null
):Parcelable