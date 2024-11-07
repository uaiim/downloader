@file:JvmName("OkHttpUtils")

package id.andtree.reqhttp

import id.andtree.reqcore.getDefaultCookieManager
import okhttp3.CookieJar
import okhttp3.JavaNetCookieJar

fun getDefaultCookieJar(): CookieJar {
    val cookieManager = getDefaultCookieManager()
    return JavaNetCookieJar(cookieManager)
}