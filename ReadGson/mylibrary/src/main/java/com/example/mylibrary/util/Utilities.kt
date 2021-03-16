package com.example.mylibrary.util

import android.app.Activity
import com.example.mylibrary.model.GoogleService
import com.google.gson.Gson
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset

class Utilities {
    companion object {
        fun loadGoogleServiceFromAsset(activity: Activity): GoogleService? {
            var json: String? = null
            json = try {
                //val `is`: InputStream = activity.assets.open("mrt_location.json")
                val `is`: InputStream = activity.assets.open("google-services.json")
                val size: Int = `is`.available()
                val buffer = ByteArray(size)
                `is`.read(buffer)
                `is`.close()
                String(buffer, Charset.defaultCharset())
            } catch (ex: IOException) {
                ex.printStackTrace()
                return null
            }
            val gson = Gson()
            val googleService = gson.fromJson<GoogleService>(json, GoogleService::class.java)
            return googleService
        }
    }
}