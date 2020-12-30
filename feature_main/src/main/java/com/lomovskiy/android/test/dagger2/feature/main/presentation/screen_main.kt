package com.lomovskiy.android.test.dagger2.feature.main.presentation

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.lomovskiy.android.test.dagger2.feature.main.di.FeatureMainComponent
import com.lomovskiy.android.test.dagger2.feature.main.R
import com.lomovskiy.android.test.dagger2.feature.main.domain.MainInteractor
import javax.inject.Inject

class ScreenMain : Fragment(R.layout.screen_main), View.OnClickListener {

    private lateinit var buttonBack: Button

    lateinit var featureMainComponent: FeatureMainComponent

    @Inject
    lateinit var interactor: MainInteractor

    override fun onAttach(context: Context) {
        super.onAttach(context)
        featureMainComponent = (requireActivity().applicationContext as FeatureMainComponent.Provider).provideFeatureMainComponent()
        featureMainComponent.inject(this)
    }

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