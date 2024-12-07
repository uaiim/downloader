@file:JvmName("FetchAndroidExtensions")

package id.andtree.reqcore

import android.content.Context
import android.net.ConnectivityManager


fun Context.isOnWiFi(): Boolean {
    val manager = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetworkInfo = manager.activeNetworkInfo
    return if (activeNetworkInfo != null && activeNetworkInfo.isConnected) {
        activeNetworkInfo.type == ConnectivityManager.TYPE_WIFI
    } else {
        false
    }
}

fun Context.isOnMeteredConnection(): Boolean {
    val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    return cm.isActiveNetworkMetered
}

fun Context.isNetworkAvailable(): Boolean {
    val manager = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetworkInfo = manager.activeNetworkInfo
    var connected = activeNetworkInfo != null && activeNetworkInfo.isConnected
    if (!connected) {
        connected = manager.allNetworkInfo.any { it.isConnected }
    }
    return connected
}