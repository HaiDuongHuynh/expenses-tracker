package com.example.expensestracker.features.onboarding.data

import android.content.Context
import com.example.expensestracker.foundation.datasource.local.LocalManager
import com.example.expensestracker.foundation.datasource.preference.PreferenceManager
import com.example.expensestracker.foundation.extension.defaultAccount
import com.example.expensestracker.foundation.extension.getCountryCode
import com.example.expensestracker.foundation.wrapper.DateTimeProvider
import com.example.expensestracker.model.Currency
import com.google.firebase.Firebase
import com.google.firebase.crashlytics.crashlytics
import com.google.firebase.crashlytics.setCustomKeys
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class OnboardingEnvironment @Inject constructor(
    private val localManager: LocalManager,
    private val preferenceManager: PreferenceManager,
    private val dateTimeProvider: DateTimeProvider,
    @ApplicationContext private val context: Context
) : IOnboardingEnvironment {

    override fun getCurrentCountryCode(): Flow<String> {
        return flowOf(getCountryCode(context))
    }

    override suspend fun saveAccount(currency: Currency) {
        val account = defaultAccount(currency, dateTimeProvider.now())

        localManager.insertAccount(account)
        setCustomPropertiesCrashlytics(currency)
        preferenceManager.setFinishOnboarding(true)
    }

    private fun setCustomPropertiesCrashlytics(currency: Currency) {
        Firebase.crashlytics.setCustomKeys {
            key("currency_code", currency.currencyCode)
            key("country_code", currency.countryCode)
        }
    }
}
