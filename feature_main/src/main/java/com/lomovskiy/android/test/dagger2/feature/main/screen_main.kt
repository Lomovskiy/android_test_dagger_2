package com.lomovskiy.android.test.dagger2.feature.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import javax.inject.Inject

internal class ScreenMain : Fragment(R.layout.screen_main), View.OnClickListener {

    private lateinit var buttonBack: Button

    @Inject
    lateinit var interactor: MainInteractor

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonBack = view.findViewById(R.id.button_back)
        buttonBack.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_back) {

        }
    }

}