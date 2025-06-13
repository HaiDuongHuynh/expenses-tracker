package com.example.expensestracker.features.transaction.all.ui

import androidx.compose.runtime.Immutable
import com.example.expensestracker.features.transaction.summary.ui.TransactionItem

@Immutable
data class AllTransactionState(
    val transactionItems: List<TransactionItem> = listOf(),
)
