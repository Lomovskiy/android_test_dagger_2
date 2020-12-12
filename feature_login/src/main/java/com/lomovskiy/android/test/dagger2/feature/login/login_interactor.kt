package com.lomovskiy.android.test.dagger2.feature.login

import javax.inject.Inject

internal interface LoginInteractor

internal class LoginInteractorImpl(private val loginRepo: LoginRepo) : LoginInteractor
