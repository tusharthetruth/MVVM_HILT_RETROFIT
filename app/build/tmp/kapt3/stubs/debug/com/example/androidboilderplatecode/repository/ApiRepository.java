package com.example.androidboilderplatecode.repository;

import androidx.lifecycle.MutableLiveData;
import com.example.androidboilderplatecode.data.sample.SampleDataModel;
import com.example.androidboilderplatecode.network.RetrofitApi;
import com.google.gson.JsonElement;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/androidboilderplatecode/repository/ApiRepository;", "", "retrofitApi", "Lcom/example/androidboilderplatecode/network/RetrofitApi;", "(Lcom/example/androidboilderplatecode/network/RetrofitApi;)V", "isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "sampleDataList", "", "Lcom/example/androidboilderplatecode/data/sample/SampleDataModel;", "getSampleEntries", "", "provideIsLoading", "provideSampleDataList", "app_debug"})
public final class ApiRepository {
    private final com.example.androidboilderplatecode.network.RetrofitApi retrofitApi = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.androidboilderplatecode.data.sample.SampleDataModel>> sampleDataList = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    
    @javax.inject.Inject()
    public ApiRepository(@org.jetbrains.annotations.NotNull()
    com.example.androidboilderplatecode.network.RetrofitApi retrofitApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.androidboilderplatecode.data.sample.SampleDataModel>> provideSampleDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> provideIsLoading() {
        return null;
    }
    
    public final void getSampleEntries() {
    }
}