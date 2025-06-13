package com.example.expensestracker.features.account.detail.data

import com.example.expensestracker.features.balance.summary.data.AccountBalance
import com.example.expensestracker.model.Account
import kotlinx.coroutines.flow.Flow

interface IAccountDetailEnvironment {
    fun getAccount(id: String): Flow<Account>
    suspend fun saveAccount(account: AccountBalance, changeReason: AdjustBalanceReason): Flow<Boolean>
    suspend fun deleteAccount(id: String)
}
