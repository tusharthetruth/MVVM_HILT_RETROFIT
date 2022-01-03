package com.example.androidboilderplatecode.data

import android.util.Log
import javax.inject.Inject

class CombineCar @Inject constructor(private var engine: Engine,
private var wheel: Wheel){

    fun runCombineCar(){
        wheel.getWheel()
        engine.getEngine()
        Log.d("runCombine","car")
    }
}