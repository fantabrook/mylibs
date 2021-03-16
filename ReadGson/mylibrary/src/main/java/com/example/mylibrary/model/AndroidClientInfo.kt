package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AndroidClientInfo (
    @SerializedName("package_name")
    var packageName: String? = null
): Parcelable