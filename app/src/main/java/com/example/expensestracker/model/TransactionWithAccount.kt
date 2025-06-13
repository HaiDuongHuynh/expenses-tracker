package com.example.expensestracker.model

data class TransactionWithAccount(
    val transaction: Transaction,
    val account: Account,
    val transferAccount: Account? = null
)
