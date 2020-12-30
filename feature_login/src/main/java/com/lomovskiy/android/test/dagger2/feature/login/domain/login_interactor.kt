package com.lomovskiy.android.test.dagger2.feature.login.domain

import javax.inject.Inject

interface LoginInteractor

class LoginInteractorImpl @Inject constructor(
    private val loginRepo: LoginRepo
) : LoginInteractor
