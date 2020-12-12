package com.lomovskiy.android.test.dagger2.di

import com.lomovskiy.android.test.dagger2.MainActivity
import dagger.Component

@ApplicationScope
@Component(modules = [AppModule::class])
internal interface AppComponent {

    fun inject(activity: MainActivity)

}
