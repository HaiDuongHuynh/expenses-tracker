package com.example.expensestracker.features.transaction.detail.ui

sealed interface TransactionEffect {
    object ClosePage : TransactionEffect
    object ShowAmountKeyboard : TransactionEffect
}
