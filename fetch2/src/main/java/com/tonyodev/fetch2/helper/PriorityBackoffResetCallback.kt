package com.tonyodev.fetch2.helper

interface PriorityBackoffResetCallback {

    fun onResetBackoffTime(namespace: String?)

}