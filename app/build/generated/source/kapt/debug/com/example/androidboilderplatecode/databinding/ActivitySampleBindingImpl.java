package com.example.androidboilderplatecode.databinding;
import com.example.androidboilderplatecode.R;
import com.example.androidboilderplatecode.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySampleBindingImpl extends ActivitySampleBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fetchData, 2);
        sViewsWithIds.put(R.id.rv, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySampleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivitySampleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.ProgressBar) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pg.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.isPgVisible == variableId) {
            setIsPgVisible((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsPgVisible(boolean IsPgVisible) {
        this.mIsPgVisible = IsPgVisible;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isPgVisible);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int isPgVisibleViewVISIBLEViewGONE = 0;
        boolean isPgVisible = mIsPgVisible;

        if ((dirtyFlags & 0x3L) != 0) {

            if((dirtyFlags & 0x3L) != 0) {
                if(isPgVisible) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read isPgVisible ? View.VISIBLE : View.GONE
                isPgVisibleViewVISIBLEViewGONE = ((isPgVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.pg.setVisibility(isPgVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isPgVisible
        flag 1 (0x2L): null
        flag 2 (0x3L): isPgVisible ? View.VISIBLE : View.GONE
        flag 3 (0x4L): isPgVisible ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}