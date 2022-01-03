package com.example.androidboilderplatecode.module;

import com.example.androidboilderplatecode.BuildConfig;
import com.example.androidboilderplatecode.network.RetrofitApi;
import com.example.androidboilderplatecode.utils.AppConstants;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/androidboilderplatecode/module/AppModule;", "", "()V", "provideApiService", "Lcom/example/androidboilderplatecode/network/RetrofitApi;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "provideBaseUrl", "", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "okHttpClient", "BASE_URL", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.androidboilderplatecode.module.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    java.lang.String BASE_URL) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.androidboilderplatecode.network.RetrofitApi provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}