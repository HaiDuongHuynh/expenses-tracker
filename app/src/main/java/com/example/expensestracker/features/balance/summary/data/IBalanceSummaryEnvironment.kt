package com.example.expensestracker.features.balance.summary.data

import com.example.expensestracker.model.Account
import kotlinx.coroutines.flow.Flow

interface IBalanceSummaryEnvironment {
    fun getAccounts(): Flow<List<Account>>
}
