package com.example.expensestracker.features.transaction.summary.data

import com.example.expensestracker.foundation.datasource.local.LocalManager
import com.example.expensestracker.foundation.wrapper.DateTimeProvider
import com.example.expensestracker.model.Account
import com.example.expensestracker.model.TopTransaction
import com.example.expensestracker.model.Transaction
import com.example.expensestracker.model.TransactionType
import com.example.expensestracker.model.TransactionWithAccount
import com.wisnu.foundation.coredatetime.generateThisMonthDateTimeRange
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

class TransactionSummaryEnvironment @Inject constructor(
    private val localManager: LocalManager,
    private val dateTimeProvider: DateTimeProvider
) : ITransactionSummaryEnvironment {

    override fun getCashFlow(): Flow<Triple<Account, List<Transaction>, List<Transaction>>> {
        val (startDate, endDate) = dateTimeProvider.now().generateThisMonthDateTimeRange()
        return combine(
            localManager.getDefaultAccount(),
            localManager.getTransactions(
                startDate = startDate,
                endDate = endDate,
                type = TransactionType.EXPENSE
            ),
            localManager.getTransactions(
                startDate = startDate,
                endDate = endDate,
                type = TransactionType.INCOME
            ),
        ) { account, expenseList, incomeList ->
            Triple(
                account,
                expenseList,
                incomeList
            )
        }
    }

    override fun getLastTransaction(): Flow<List<TransactionWithAccount>> {
        val (startDate, endDate) = dateTimeProvider.now().generateThisMonthDateTimeRange()
        return localManager.getTransactionWithAccounts(
            startDate = startDate,
            endDate = endDate,
            limit = DEFAULT_LIMIT
        )
    }

    override fun getTopExpense(): Flow<List<TopTransaction>> {
        val (startDate, endDate) = dateTimeProvider.now().generateThisMonthDateTimeRange()
        return localManager.getTopTransactions(
            startDate = startDate,
            endDate = endDate,
            type = TransactionType.EXPENSE,
            limit = DEFAULT_LIMIT
        )
    }

    companion object {
        private const val DEFAULT_LIMIT = 5
    }

}

