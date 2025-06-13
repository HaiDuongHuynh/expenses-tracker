package com.example.expensestracker.foundation.datasource.local.model

import androidx.room.Embedded

data class TransactionWithAccountDb(
    @Embedded val transaction: TransactionDb,
    @Embedded val account: AccountDb
)
