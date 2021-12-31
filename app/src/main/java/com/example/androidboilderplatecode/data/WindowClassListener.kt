package com.example.androidboilderplatecode.data

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

class WindowClassListener @Inject constructor(): WindowListener{
        override fun onButtonClick(){
            Log.d("clicked","window class button clicked");
        }
    }

class WindowMain @Inject constructor(private val windowClassListener: WindowClassListener){

}

@Module
@InstallIn(SingletonComponent::class)
 class WindowModule{

//    @Binds
//    @Singleton
//    abstract fun provideWindowListener(windowClassListener: WindowClassListener):WindowListener;

    @Provides
    @Singleton
     fun provideWindowListener()=WindowClassListener();


}



