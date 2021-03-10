package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class MRTLocation (
    @SerializedName("code") var code: String? = null,
    @SerializedName("lat") var lattitude: Double? = null,
    @SerializedName("lng") var longitude: Double? = null
): Parcelable
