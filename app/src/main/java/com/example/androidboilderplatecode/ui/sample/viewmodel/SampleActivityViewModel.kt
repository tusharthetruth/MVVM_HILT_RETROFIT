package com.example.androidboilderplatecode.ui.sample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidboilderplatecode.data.sample.SampleDataModel
import com.example.androidboilderplatecode.repository.ApiRepository
import javax.inject.Inject

class SampleActivityViewModel @Inject constructor(private val apiRepository: ApiRepository)
    :ViewModel() {

        fun provideSampleDataList(): MutableLiveData<List<SampleDataModel>> {
            return apiRepository.provideSampleDataList()
        }
        fun provideIsLoading(): MutableLiveData<Boolean> {
            return apiRepository.provideIsLoading()
        }

        fun getSampleEntries(){
            apiRepository.getSampleEntries()
        }

}