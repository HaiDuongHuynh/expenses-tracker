package com.example.expensestracker.features.transaction.all.ui

sealed interface AllTransactionEffect {
    object Initial : AllTransactionEffect
}
