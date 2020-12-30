package com.lomovskiy.android.test.dagger2.app

import android.app.Application
import com.lomovskiy.android.test.dagger2.feature.login.di.FeatureLoginComponent
import com.lomovskiy.android.test.dagger2.feature.main.di.FeatureMainComponent

class AppLoader : Application(), FeatureMainComponent.Provider, FeatureLoginComponent.Provider {

    internal lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .build()
    }

    override fun provideFeatureMainComponent(): FeatureMainComponent {
        return appComponent.featureMainComponent().create()
    }

    override fun provideFeatureLoginComponent(): FeatureLoginComponent {
        return appComponent.featureLoginComponent().create()
    }

}
