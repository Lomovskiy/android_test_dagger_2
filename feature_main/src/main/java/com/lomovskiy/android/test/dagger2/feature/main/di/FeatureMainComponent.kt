package com.lomovskiy.android.test.dagger2.feature.main.di

import com.lomovskiy.android.test.dagger2.feature.main.presentation.ScreenMain
import dagger.Subcomponent

@Subcomponent(modules = [FeatureMainModule::class])
interface FeatureMainComponent {

    @Subcomponent.Factory
    interface Factory {

        fun create(): FeatureMainComponent

    }

    interface Provider {
        fun provideFeatureMainComponent(): FeatureMainComponent
    }

    fun inject(screen: ScreenMain)

}
