package com.example.expensestracker.features.transaction.topexpense.ui

sealed interface TopExpenseEffect {
    object Initial : TopExpenseEffect
}
