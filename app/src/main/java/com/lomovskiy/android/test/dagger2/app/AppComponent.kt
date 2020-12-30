package com.lomovskiy.android.test.dagger2.app

import com.lomovskiy.android.test.dagger2.feature.login.di.FeatureLoginComponent
import com.lomovskiy.android.test.dagger2.feature.login.di.FeatureLoginModule
import com.lomovskiy.android.test.dagger2.feature.main.di.FeatureMainComponent
import com.lomovskiy.android.test.dagger2.feature.main.di.FeatureMainModule
import dagger.Component

@Component(modules = [
    AppModule::class
])
interface AppComponent {

    fun featureMainComponent(): FeatureMainComponent.Factory

    fun featureLoginComponent(): FeatureLoginComponent.Factory

}
