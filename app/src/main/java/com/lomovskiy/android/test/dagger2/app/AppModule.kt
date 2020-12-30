package com.lomovskiy.android.test.dagger2.app

import com.lomovskiy.android.test.dagger2.feature.login.di.FeatureLoginComponent
import com.lomovskiy.android.test.dagger2.feature.main.di.FeatureMainComponent
import dagger.Module

@Module(subcomponents = [
    FeatureMainComponent::class,
    FeatureLoginComponent::class
])
abstract class AppModule
