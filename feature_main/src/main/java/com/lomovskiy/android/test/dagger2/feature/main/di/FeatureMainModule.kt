package com.lomovskiy.android.test.dagger2.feature.main.di

import com.lomovskiy.android.test.dagger2.feature.main.data.MainRepoImpl
import com.lomovskiy.android.test.dagger2.feature.main.domain.MainInteractor
import com.lomovskiy.android.test.dagger2.feature.main.domain.MainInteractorImpl
import com.lomovskiy.android.test.dagger2.feature.main.domain.MainRepo
import dagger.Binds
import dagger.Module

@Module
abstract class FeatureMainModule {

    @Binds
    abstract fun bindMainRepo(impl: MainRepoImpl): MainRepo

    @Binds
    abstract fun bindMainInteractor(impl: MainInteractorImpl): MainInteractor

}
