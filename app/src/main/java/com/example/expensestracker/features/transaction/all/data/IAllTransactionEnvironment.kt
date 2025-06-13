package com.example.expensestracker.features.transaction.all.data

import com.example.expensestracker.model.TransactionWithAccount
import kotlinx.coroutines.flow.Flow

interface IAllTransactionEnvironment {
    fun getTransactions(): Flow<List<TransactionWithAccount>>
}
