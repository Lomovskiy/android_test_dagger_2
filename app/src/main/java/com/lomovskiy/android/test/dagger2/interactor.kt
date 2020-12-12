package com.lomovskiy.android.test.dagger2

import com.lomovskiy.android.test.dagger2.repo.FirstRepo
import com.lomovskiy.android.test.dagger2.repo.SecondRepo
import javax.inject.Inject
import javax.inject.Singleton

internal interface Interactor

internal class InteractorImpl @Inject constructor(
    private val firstRepo: FirstRepo,
    private val secondRepo: SecondRepo
) : Interactor
