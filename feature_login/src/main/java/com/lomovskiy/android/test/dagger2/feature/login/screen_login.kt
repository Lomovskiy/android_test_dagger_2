package com.lomovskiy.android.test.dagger2.feature.login

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import javax.inject.Inject

internal class ScreenLogin : Fragment(R.layout.screen_login), View.OnClickListener {

    @Inject
    lateinit var interactor: LoginInteractor

    private lateinit var buttonDoLogin: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonDoLogin = view.findViewById(R.id.button_do_login)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_do_login) {
            Toast.makeText(requireContext(), "Do login", Toast.LENGTH_SHORT).show()
        }
    }

}