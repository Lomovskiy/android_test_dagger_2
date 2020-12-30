package com.lomovskiy.android.test.dagger2.feature.login.presentation

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.lomovskiy.android.test.dagger2.feature.login.R
import com.lomovskiy.android.test.dagger2.feature.login.di.FeatureLoginComponent
import com.lomovskiy.android.test.dagger2.feature.login.domain.LoginInteractor
import javax.inject.Inject

class ScreenLogin : Fragment(R.layout.screen_login), View.OnClickListener {

    @Inject
    lateinit var interactor: LoginInteractor

    lateinit var featureComponent: FeatureLoginComponent

    private lateinit var buttonDoLogin: Button

    override fun onAttach(context: Context) {
        super.onAttach(context)
        featureComponent = (requireActivity().applicationContext as FeatureLoginComponent.Provider).provideFeatureLoginComponent()
        featureComponent.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonDoLogin = view.findViewById(R.id.button_do_login)
        buttonDoLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_do_login) {
            Toast.makeText(requireContext(), "Do login", Toast.LENGTH_SHORT).show()
        }
    }

}