package com.example.expensestracker.features.balance.summary.data

import com.example.expensestracker.foundation.datasource.local.LocalManager
import com.example.expensestracker.model.Account
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class BalanceSummaryEnvironment @Inject constructor(
    private val localManager: LocalManager
) : IBalanceSummaryEnvironment {
    override fun getAccounts(): Flow<List<Account>> {
        return localManager.getAccountWithTransactions()
    }
}
