package com.example.mylibrary.util

import android.app.Activity
import com.google.gson.Gson
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset

class Utilities {
    companion object {
        fun loadJSONFromAsset(activity: Activity): String? {
            var json: String? = null
            json = try {
                val `is`: InputStream = activity.assets.open("mrt_location.json")
                val size: Int = `is`.available()
                val buffer = ByteArray(size)
                `is`.read(buffer)
                `is`.close()
                String(buffer, Charset.defaultCharset())
            } catch (ex: IOException) {
                ex.printStackTrace()
                return null
            }
            return json
        }
    }
}