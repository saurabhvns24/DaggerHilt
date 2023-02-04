package com.example.hiltandroid


import android.util.Log
import javax.inject.Inject

private const val TAG = "LoggerService"

class LoggerService @Inject constructor() {
    fun getLogService(logMsg: String) {
        Log.d(TAG, "getLogService: $logMsg")
    }
}