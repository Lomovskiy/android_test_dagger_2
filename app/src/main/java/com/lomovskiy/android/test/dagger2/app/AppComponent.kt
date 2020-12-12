package com.lomovskiy.android.test.dagger2.app

import com.lomovskiy.android.test.dagger2.di.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(modules = [AppModule::class])
internal interface AppComponent {

    fun inject(activity: MainActivity)

}
