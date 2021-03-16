package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProjectInfo (
    @SerializedName("project_number")
    var projectNumber: String? = null,

    @SerializedName("firebase_url")
    var firebaseURL: String? = null,

    @SerializedName("project_id")
    var projectID: String? = null,

    @SerializedName("storage_bucket")
    var storageBucket: String? = null
):Parcelable
