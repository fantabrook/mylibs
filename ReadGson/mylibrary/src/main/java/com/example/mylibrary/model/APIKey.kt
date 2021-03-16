package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class APIKey (
    @SerializedName("current_key")
    var currentKey: String? = null
): Parcelable