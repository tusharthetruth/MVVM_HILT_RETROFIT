package com.example.androidboilderplatecode.ui.sample.view;

import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.androidboilderplatecode.R;
import com.example.androidboilderplatecode.appbase.AppBaseActivity;
import com.example.androidboilderplatecode.data.sample.SampleDataModel;
import com.example.androidboilderplatecode.databinding.ActivitySampleBinding;
import com.example.androidboilderplatecode.ui.sample.adapter.SampleDataAdapter;
import com.example.androidboilderplatecode.ui.sample.viewmodel.SampleActivityViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/example/androidboilderplatecode/ui/sample/view/SampleActivity;", "Lcom/example/androidboilderplatecode/appbase/AppBaseActivity;", "()V", "adapter", "Lcom/example/androidboilderplatecode/ui/sample/adapter/SampleDataAdapter;", "getAdapter", "()Lcom/example/androidboilderplatecode/ui/sample/adapter/SampleDataAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/example/androidboilderplatecode/databinding/ActivitySampleBinding;", "getBinding", "()Lcom/example/androidboilderplatecode/databinding/ActivitySampleBinding;", "setBinding", "(Lcom/example/androidboilderplatecode/databinding/ActivitySampleBinding;)V", "sampleActivityViewModel", "Lcom/example/androidboilderplatecode/ui/sample/viewmodel/SampleActivityViewModel;", "getSampleActivityViewModel", "()Lcom/example/androidboilderplatecode/ui/sample/viewmodel/SampleActivityViewModel;", "setSampleActivityViewModel", "(Lcom/example/androidboilderplatecode/ui/sample/viewmodel/SampleActivityViewModel;)V", "initObservers", "", "initUi", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SampleActivity extends com.example.androidboilderplatecode.appbase.AppBaseActivity {
    @javax.inject.Inject()
    public com.example.androidboilderplatecode.ui.sample.viewmodel.SampleActivityViewModel sampleActivityViewModel;
    public com.example.androidboilderplatecode.databinding.ActivitySampleBinding binding;
    private final kotlin.Lazy adapter$delegate = null;
    
    public SampleActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidboilderplatecode.ui.sample.viewmodel.SampleActivityViewModel getSampleActivityViewModel() {
        return null;
    }
    
    public final void setSampleActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.example.androidboilderplatecode.ui.sample.viewmodel.SampleActivityViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidboilderplatecode.databinding.ActivitySampleBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.androidboilderplatecode.databinding.ActivitySampleBinding p0) {
    }
    
    private final com.example.androidboilderplatecode.ui.sample.adapter.SampleDataAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi() {
    }
    
    private final void initObservers() {
    }
}