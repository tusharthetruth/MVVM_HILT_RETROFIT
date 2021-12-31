package com.example.androidboilderplatecode.data

import android.util.Log
import com.example.androidboilderplatecode.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier


class QualifierTest @Inject constructor(

    @FName
    var fName:String,

    @LName
    var lastName:String

    ){

    fun getName(){
        Log.d("name","fname $fName lName $lastName")
    }
}

@Module
@InstallIn(SingletonComponent::class)
class QualifierModule{

    @Provides
    @FName
    fun getfName():String=MainActivity.fName

    @Provides
    @LName
    fun getlName():String=MainActivity.lName
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName