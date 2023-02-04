package com.example.hiltandroid

import android.util.Log
import javax.inject.Inject

private const val TAG = "UserRepository"
class UserRepository @Inject constructor() {
    fun saveUser(userName:String,password:String){
        Log.d(TAG, "saveUser: UserName = $userName password = $password")
    }
}