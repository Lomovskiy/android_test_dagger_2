package com.lomovskiy.android.test.dagger2

import android.app.Application
import com.lomovskiy.android.test.dagger2.di.AppComponent
import com.lomovskiy.android.test.dagger2.di.DaggerAppComponent

class AppLoader : Application() {

    internal lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .build()
    }

}