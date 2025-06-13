package com.example.expensestracker.foundation.extension


fun com.example.expensestracker.model.Account.toAccountDb(): com.example.expensestracker.foundation.datasource.local.model.AccountDb {
    return com.example.expensestracker.foundation.datasource.local.model.AccountDb(
        id = id,
        currencyCode = currency.currencyCode,
        countryCode = currency.countryCode,
        amount = amount.toLong(),
        name = name,
        type = type,
        createdAt = createdAt,
        updatedAt = updatedAt
    )
}

fun com.example.expensestracker.model.Transaction.toTransactionDb(accountId: String, transferAccountId: String?): com.example.expensestracker.foundation.datasource.local.model.TransactionDb {
    return com.example.expensestracker.foundation.datasource.local.model.TransactionDb(
        id = id,
        accountId = accountId,
        categoryType = categoryType,
        currencyCode = currency.currencyCode,
        countryCode = currency.countryCode,
        amount = amount.toLong(),
        type = type,
        date = date,
        createdAt = createdAt,
        updatedAt = updatedAt,
        note = note,
        transferAccountId = transferAccountId
    )
}

fun com.example.expensestracker.model.AccountRecord.toAccountRecordDb(): com.example.expensestracker.foundation.datasource.local.model.AccountRecordDb {
    return com.example.expensestracker.foundation.datasource.local.model.AccountRecordDb(
        id = id,
        accountId = accountId,
        amount = amount.toLong(),
        createdAt = createdAt
    )
}

fun com.example.expensestracker.model.TransactionRecord.toTransactionRecordDb(): com.example.expensestracker.foundation.datasource.local.model.TransactionRecordDb {
    return com.example.expensestracker.foundation.datasource.local.model.TransactionRecordDb(
        id = id,
        transactionId = transactionId,
        amount = amount.toLong(),
        createdAt = createdAt
    )
}
