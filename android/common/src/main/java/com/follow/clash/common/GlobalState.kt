package com.follow.clash.common

import android.app.Application
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

object GlobalState : CoroutineScope by CoroutineScope(Dispatchers.Default) {

    const val NOTIFICATION_CHANNEL = "FlClash"

    const val NOTIFICATION_ID = 1

    val application: Application
        get() = _application


    fun log(text: String) {
        Log.d("[FlClash]", text)
    }

    private lateinit var _application: Application

    fun init(application: Application) {
        _application = application
    }
}