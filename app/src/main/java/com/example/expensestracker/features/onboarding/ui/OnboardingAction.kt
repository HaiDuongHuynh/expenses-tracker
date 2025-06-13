package com.example.expensestracker.features.onboarding.ui

import com.example.expensestracker.model.Currency

sealed interface OnboardingAction {
    object ClickSave : OnboardingAction
    data class SelectCurrency(val item: Currency) : OnboardingAction
}
