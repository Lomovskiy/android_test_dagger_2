package com.lomovskiy.android.test.dagger2.feature.main.domain

import javax.inject.Inject

interface MainInteractor

class MainInteractorImpl @Inject constructor(
    private val mainRepo: MainRepo
) : MainInteractor
