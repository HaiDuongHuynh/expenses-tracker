package com.example.expensestracker.features.onboarding.data

import com.example.expensestracker.model.Currency
import kotlinx.coroutines.flow.Flow

interface IOnboardingEnvironment {
    fun getCurrentCountryCode(): Flow<String>
    suspend fun saveAccount(currency: Currency)
}
