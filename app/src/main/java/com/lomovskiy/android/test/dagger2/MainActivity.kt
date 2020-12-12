package com.lomovskiy.android.test.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

internal class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var interactor: Interactor

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as AppLoader).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
