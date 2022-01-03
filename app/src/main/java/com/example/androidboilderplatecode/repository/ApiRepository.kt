package com.example.androidboilderplatecode.repository

import androidx.lifecycle.MutableLiveData
import com.example.androidboilderplatecode.data.sample.SampleDataModel
import com.example.androidboilderplatecode.network.RetrofitApi
import com.google.gson.JsonElement
import logd
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class ApiRepository@Inject constructor(private val retrofitApi: RetrofitApi) {

    private val sampleDataList:MutableLiveData<List<SampleDataModel>> = MutableLiveData()
    private val isLoading:MutableLiveData<Boolean> = MutableLiveData()

    fun provideSampleDataList(): MutableLiveData<List<SampleDataModel>> {
        return sampleDataList
    }
    fun provideIsLoading(): MutableLiveData<Boolean> {
        return isLoading
    }

    fun getSampleEntries() {
        val url: String = "https://api.publicapis.org/entries"
        val task = retrofitApi.getSampleEntries(url = url)
        provideIsLoading().postValue(true)
        task.enqueue(object : Callback<JsonElement>{
            override fun onResponse(call: Call<JsonElement>, response: Response<JsonElement>) {
                provideIsLoading().postValue(false)
                logd("sampleCallBack",response.body().toString())
                val responseJson=JSONObject(response.body().toString())
                val entriesArray=responseJson.getJSONArray("entries")
                val sampleDataList=ArrayList<SampleDataModel>()
                for(i in 0 until entriesArray.length()){
                    val js: JSONObject =entriesArray.getJSONObject(i)
                    val m= SampleDataModel(
                        js.getString("API"),
                        js.getString("Description"),
                        js.getString("Auth"),
                        js.getBoolean("HTTPS"),
                        js.getString("Cors"),
                        js.getString("Link"),
                        js.getString("Category")
                    )
                    sampleDataList.add(m)
                }
                provideSampleDataList().postValue(sampleDataList)
            }

            override fun onFailure(call: Call<JsonElement>, t: Throwable) {
                provideIsLoading().postValue(false)
                logd("sampleCallBack",t.toString())
            }

        })


    }
}