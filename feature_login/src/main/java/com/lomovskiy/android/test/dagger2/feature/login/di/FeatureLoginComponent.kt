package com.lomovskiy.android.test.dagger2.feature.login.di

import com.lomovskiy.android.test.dagger2.feature.login.presentation.ScreenLogin
import dagger.Subcomponent

@Subcomponent(modules = [FeatureLoginModule::class])
interface FeatureLoginComponent {

    @Subcomponent.Factory
    interface Factory {

        fun create(): FeatureLoginComponent

    }

    interface Provider {

        fun provideFeatureLoginComponent(): FeatureLoginComponent

    }

    fun inject(screen: ScreenLogin)

}