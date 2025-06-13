package com.example.expensestracker.features.splash.data

import com.example.expensestracker.foundation.datasource.preference.PreferenceManager
import com.example.expensestracker.model.Credential
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class SplashEnvironment @Inject constructor(
    private val preferenceManager: PreferenceManager
) : ISplashEnvironment {

    override fun getCredential(): Flow<Credential> {
        return preferenceManager.getCredential()
    }

    override fun hasFinishOnboarding(): Flow<Boolean> {
        return preferenceManager.hasFinishOnboarding()
    }

}
