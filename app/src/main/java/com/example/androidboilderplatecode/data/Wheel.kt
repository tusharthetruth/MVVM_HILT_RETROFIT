package com.example.androidboilderplatecode.data

import android.util.Log
import javax.inject.Inject

class Wheel {
    @Inject
    constructor()

    fun getWheel(){
        Log.d("getWheel","wheel")
    }
}