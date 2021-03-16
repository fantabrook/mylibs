package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class AnalyticsService (
    @SerializedName("status")
    var status: Long? = null
): Parcelable
