package com.example.androidboilderplatecode.data

import android.util.Log
import javax.inject.Inject

class Car {
    @Inject
    constructor()
    fun run(){
        Log.d("run","running")
    }

}