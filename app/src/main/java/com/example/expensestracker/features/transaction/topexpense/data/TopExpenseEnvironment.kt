package com.example.expensestracker.features.transaction.topexpense.data

import com.example.expensestracker.foundation.datasource.local.LocalManager
import com.example.expensestracker.model.Currency
import com.example.expensestracker.model.TopTransaction
import com.example.expensestracker.model.TransactionType
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.take

class TopExpenseEnvironment @Inject constructor(
    private val localManager: LocalManager,
) : ITopExpenseEnvironment {
    override fun getTopExpense(): Flow<List<TopTransaction>> {
        return localManager.getTopTransactions(TransactionType.EXPENSE)
    }

    override fun getCurrency(): Flow<Currency> {
        return localManager.getDefaultAccount()
            .take(1)
            .map { it.currency }
    }
}
