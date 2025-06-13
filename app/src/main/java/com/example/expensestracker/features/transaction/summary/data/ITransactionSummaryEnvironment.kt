package com.example.expensestracker.features.transaction.summary.data

import com.example.expensestracker.model.Account
import com.example.expensestracker.model.TopTransaction
import com.example.expensestracker.model.Transaction
import com.example.expensestracker.model.TransactionWithAccount
import kotlinx.coroutines.flow.Flow

interface ITransactionSummaryEnvironment {
    fun getCashFlow(): Flow<Triple<Account, List<Transaction>, List<Transaction>>>
    fun getLastTransaction(): Flow<List<TransactionWithAccount>>
    fun getTopExpense(): Flow<List<TopTransaction>>
}
