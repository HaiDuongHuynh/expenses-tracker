package com.example.expensestracker.features.login.ui

sealed class LoginEffect {
    object NavigateToDashboard : LoginEffect()
}
