package com.example.androidboilderplatecode

import android.os.Bundle
import android.util.Log
import com.boilerplate.base.baseclassess.BaseActivity
import com.example.androidboilderplatecode.data.Car
import com.example.androidboilderplatecode.data.CombineCar
import com.example.androidboilderplatecode.data.QualifierTest
import com.example.androidboilderplatecode.data.WindowClassListener
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Qualifier

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    @Inject
    lateinit var car:Car

    @Inject
    lateinit var combineCar:CombineCar

    @Inject
    lateinit var windowClassListener: WindowClassListener

    @Inject
    lateinit var qualifier: QualifierTest

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    companion object{
        var fName:String="b"
        var lName:String="n"
    }
    override fun onResume() {
        super.onResume()
        car.run()
        combineCar.runCombineCar()
        windowClassListener.onButtonClick()
        fName="boni"
        lName="kumar"
        qualifier.getName()
    }
}