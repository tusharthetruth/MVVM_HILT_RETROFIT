package com.example.androidboilderplatecode.ui.sample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.example.androidboilderplatecode.R;
import com.example.androidboilderplatecode.data.sample.SampleDataModel;
import com.example.androidboilderplatecode.databinding.SampleListBinding;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001e\u0010\u0015\u001a\u00020\u000e2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0017R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/example/androidboilderplatecode/ui/sample/adapter/SampleDataAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/androidboilderplatecode/data/sample/SampleDataModel;", "Lcom/example/androidboilderplatecode/ui/sample/adapter/SampleDataAdapter$SampleDataHolder;", "()V", "list", "Ljava/util/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateItems", "newList", "Lkotlin/collections/ArrayList;", "SampleDataHolder", "SimpleDiffCallBack", "app_debug"})
public final class SampleDataAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.androidboilderplatecode.data.sample.SampleDataModel, com.example.androidboilderplatecode.ui.sample.adapter.SampleDataAdapter.SampleDataHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.androidboilderplatecode.data.sample.SampleDataModel> list;
    
    public SampleDataAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.androidboilderplatecode.data.sample.SampleDataModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.androidboilderplatecode.data.sample.SampleDataModel> p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.androidboilderplatecode.ui.sample.adapter.SampleDataAdapter.SampleDataHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.androidboilderplatecode.ui.sample.adapter.SampleDataAdapter.SampleDataHolder holder, int position) {
    }
    
    public final void updateItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.androidboilderplatecode.data.sample.SampleDataModel> newList) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/androidboilderplatecode/ui/sample/adapter/SampleDataAdapter$SampleDataHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "binding", "Lcom/example/androidboilderplatecode/databinding/SampleListBinding;", "kotlin.jvm.PlatformType", "bindItem", "", "model", "Lcom/example/androidboilderplatecode/data/sample/SampleDataModel;", "app_debug"})
    public static final class SampleDataHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.androidboilderplatecode.databinding.SampleListBinding binding;
        
        public SampleDataHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        com.example.androidboilderplatecode.data.sample.SampleDataModel model) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/androidboilderplatecode/ui/sample/adapter/SampleDataAdapter$SimpleDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/androidboilderplatecode/data/sample/SampleDataModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class SimpleDiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.androidboilderplatecode.data.sample.SampleDataModel> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.androidboilderplatecode.ui.sample.adapter.SampleDataAdapter.SimpleDiffCallBack INSTANCE = null;
        
        private SimpleDiffCallBack() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.androidboilderplatecode.data.sample.SampleDataModel oldItem, @org.jetbrains.annotations.NotNull()
        com.example.androidboilderplatecode.data.sample.SampleDataModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.androidboilderplatecode.data.sample.SampleDataModel oldItem, @org.jetbrains.annotations.NotNull()
        com.example.androidboilderplatecode.data.sample.SampleDataModel newItem) {
            return false;
        }
    }
}