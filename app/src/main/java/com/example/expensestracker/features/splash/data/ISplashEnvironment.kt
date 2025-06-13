package com.example.expensestracker.features.splash.data

import com.example.expensestracker.model.Credential
import kotlinx.coroutines.flow.Flow

interface ISplashEnvironment {
    fun getCredential(): Flow<Credential>
    fun hasFinishOnboarding(): Flow<Boolean>
}
