package com.lomovskiy.android.test.dagger2.di

import com.lomovskiy.android.test.dagger2.Interactor
import com.lomovskiy.android.test.dagger2.InteractorImpl
import com.lomovskiy.android.test.dagger2.repo.FirstRepo
import com.lomovskiy.android.test.dagger2.repo.FirstRepoImpl
import com.lomovskiy.android.test.dagger2.repo.SecondRepo
import com.lomovskiy.android.test.dagger2.repo.SecondRepoImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@ApplicationScope
@Module
abstract class AppModule {

    @Binds
    internal abstract fun bindFirstRepo(impl: FirstRepoImpl): FirstRepo

    @Binds
    internal abstract fun bindSecondRepo(impl: SecondRepoImpl): SecondRepo

    @Binds
    internal abstract fun bindInteractor(impl: InteractorImpl): Interactor

}
