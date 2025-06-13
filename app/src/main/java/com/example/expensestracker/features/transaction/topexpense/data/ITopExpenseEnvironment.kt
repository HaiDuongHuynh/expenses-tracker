package com.example.expensestracker.features.transaction.topexpense.data

import com.example.expensestracker.model.Currency
import com.example.expensestracker.model.TopTransaction
import kotlinx.coroutines.flow.Flow

interface ITopExpenseEnvironment {
    fun getTopExpense(): Flow<List<TopTransaction>>
    fun getCurrency(): Flow<Currency>
}
