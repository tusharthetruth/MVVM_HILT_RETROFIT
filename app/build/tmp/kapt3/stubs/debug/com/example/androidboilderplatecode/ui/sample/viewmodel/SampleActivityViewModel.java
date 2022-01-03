package com.example.androidboilderplatecode.ui.sample.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.androidboilderplatecode.data.sample.SampleDataModel;
import com.example.androidboilderplatecode.repository.ApiRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/androidboilderplatecode/ui/sample/viewmodel/SampleActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "apiRepository", "Lcom/example/androidboilderplatecode/repository/ApiRepository;", "(Lcom/example/androidboilderplatecode/repository/ApiRepository;)V", "getSampleEntries", "", "provideIsLoading", "Landroidx/lifecycle/MutableLiveData;", "", "provideSampleDataList", "", "Lcom/example/androidboilderplatecode/data/sample/SampleDataModel;", "app_debug"})
public final class SampleActivityViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.androidboilderplatecode.repository.ApiRepository apiRepository = null;
    
    @javax.inject.Inject()
    public SampleActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.example.androidboilderplatecode.repository.ApiRepository apiRepository) {
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