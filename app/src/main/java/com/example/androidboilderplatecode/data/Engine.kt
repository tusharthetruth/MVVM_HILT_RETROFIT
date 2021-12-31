package com.example.androidboilderplatecode.data

import android.util.Log
import javax.inject.Inject

class Engine {

    @Inject
    constructor()

    fun getEngine(){
        Log.d("getEngine","engine")
    }
}