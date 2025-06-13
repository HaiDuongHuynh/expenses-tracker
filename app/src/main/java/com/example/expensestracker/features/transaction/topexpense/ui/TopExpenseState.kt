package com.example.expensestracker.features.transaction.topexpense.ui

import androidx.compose.runtime.Immutable
import com.example.expensestracker.features.transaction.summary.ui.TopExpenseItem
import com.example.expensestracker.model.Currency

@Immutable
data class TopExpenseState(
    val topExpenseItems: List<TopExpenseItem> = listOf(),
    val currency: Currency = Currency.Companion.DEFAULT
)
