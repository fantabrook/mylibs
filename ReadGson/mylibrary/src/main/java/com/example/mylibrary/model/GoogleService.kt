package com.example.mylibrary.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GoogleService (
    @SerializedName("project_info")
    var projectInfo: ProjectInfo? = null,

    @SerializedName("client")
    var client: List<Client>? = null,

    @SerializedName("configuration_version")
    var configurationVersion: String? = null
): Parcelable