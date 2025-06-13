package com.example.expensestracker.foundation.datasource.local.model

import com.example.expensestracker.model.CategoryType

data class TopTransactionDb(
    val type: CategoryType,
    val amount: Long,
)
