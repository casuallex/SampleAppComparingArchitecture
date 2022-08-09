package com.example.sampleappcomparingarchitecture

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import retrofit2.Retrofit


@HiltAndroidApp
class App : Application(){
    val retrofitInstance: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .build()
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: App
    }
}