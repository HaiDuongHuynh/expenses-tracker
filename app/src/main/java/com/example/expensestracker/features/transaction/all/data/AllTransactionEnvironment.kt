package com.example.expensestracker.features.transaction.all.data

import com.example.expensestracker.foundation.datasource.local.LocalManager
import com.example.expensestracker.model.TransactionWithAccount
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class AllTransactionEnvironment @Inject constructor(
    private val localManager: LocalManager,
) : IAllTransactionEnvironment {
    override fun getTransactions(): Flow<List<TransactionWithAccount>> {
        return localManager.getTransactionWithAccounts()
    }
}
