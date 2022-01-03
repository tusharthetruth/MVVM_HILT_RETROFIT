import android.util.Log
import com.boilerplate.base.BuildConfig

fun Any.logd(tag:String, value:String){
    if(BuildConfig.DEBUG){
        Log.d(tag,value)
    }
}

