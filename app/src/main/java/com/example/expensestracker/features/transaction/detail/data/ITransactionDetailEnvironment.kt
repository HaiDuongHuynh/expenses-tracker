package com.example.expensestracker.features.transaction.detail.data

import com.example.expensestracker.model.Account
import com.example.expensestracker.model.CategoryType
import com.example.expensestracker.model.TransactionWithAccount
import java.time.LocalDateTime
import kotlinx.coroutines.flow.Flow

interface ITransactionDetailEnvironment {
    fun getAccounts(): Flow<List<Account>>
    fun getTransaction(id: String): Flow<TransactionWithAccount>
    fun getCurrentDate(): LocalDateTime
    fun getTopCategory(): Flow<List<CategoryType>>
    suspend fun saveTransaction(transactionWithAccount: TransactionWithAccount): Flow<Account>
    suspend fun deleteTransaction(id: String): Flow<Boolean>
    fun trackSaveTransactionButtonClicked()
}
