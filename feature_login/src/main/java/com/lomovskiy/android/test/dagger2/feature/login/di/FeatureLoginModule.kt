package com.lomovskiy.android.test.dagger2.feature.login.di

import com.lomovskiy.android.test.dagger2.feature.login.data.LoginRepoImpl
import com.lomovskiy.android.test.dagger2.feature.login.domain.LoginInteractor
import com.lomovskiy.android.test.dagger2.feature.login.domain.LoginInteractorImpl
import com.lomovskiy.android.test.dagger2.feature.login.domain.LoginRepo
import dagger.Binds
import dagger.Module

@Module
abstract class FeatureLoginModule {

    @Binds
    abstract fun bindLoginRepo(impl: LoginRepoImpl): LoginRepo

    @Binds
    abstract fun bindLoginInteractor(impl: LoginInteractorImpl): LoginInteractor

}
