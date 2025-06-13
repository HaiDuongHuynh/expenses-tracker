package com.example.expensestracker.foundation.extension


fun List<com.example.expensestracker.foundation.datasource.local.model.TransactionDb>.toTransaction() = map {
    it.toTransaction()
}

fun com.example.expensestracker.foundation.datasource.local.model.TransactionDb.toTransaction() =
    com.example.expensestracker.model.Transaction(
        id = id,
        currency = com.example.expensestracker.model.Currency(currencyCode, countryCode),
        categoryType = categoryType,
        amount = amount.toBigDecimal(),
        type = type,
        date = date,
        createdAt = createdAt,
        updatedAt = updatedAt,
        note = note
    )

fun List<com.example.expensestracker.foundation.datasource.local.model.AccountDb>.toAccount(transactions: List<com.example.expensestracker.model.Transaction> = listOf()) = map {
    it.toAccount(transactions)
}

suspend fun List<com.example.expensestracker.foundation.datasource.local.model.TransactionWithAccountDb>.toTransactionWithAccount(
    getTransferAccount: suspend (String) -> com.example.expensestracker.model.Account?
): List<com.example.expensestracker.model.TransactionWithAccount> {
    return map {
        it.toTransactionWithAccount { accountId ->
            getTransferAccount(accountId)
        }
    }
}

suspend fun com.example.expensestracker.foundation.datasource.local.model.TransactionWithAccountDb.toTransactionWithAccount(
    getTransferAccount: suspend (String) -> com.example.expensestracker.model.Account?
): com.example.expensestracker.model.TransactionWithAccount {
    val transferAccount = if (transaction.transferAccountId != null) {
        getTransferAccount(transaction.transferAccountId)
    } else {
        null
    }

    return com.example.expensestracker.model.TransactionWithAccount(
        transaction = transaction.toTransaction(),
        account = account.toAccount(),
        transferAccount = transferAccount
    )
}

fun com.example.expensestracker.foundation.datasource.local.model.AccountDb.toAccount(transactions: List<com.example.expensestracker.model.Transaction> = listOf()) =
    com.example.expensestracker.model.Account(
        id = id,
        currency = com.example.expensestracker.model.Currency(currencyCode, countryCode),
        name = name,
        type = type,
        amount = amount.toBigDecimal(),
        createdAt = createdAt,
        updatedAt = updatedAt,
        transactions = transactions
    )

fun com.example.expensestracker.foundation.datasource.local.model.AccountRecordDb?.toAccountRecord(): com.example.expensestracker.model.AccountRecord? {
    return if (this != null) {
        com.example.expensestracker.model.AccountRecord(
            id = id,
            amount = amount.toBigDecimal(),
            createdAt = createdAt,
            accountId = accountId
        )
    } else {
        null
    }
}

fun com.example.expensestracker.foundation.datasource.local.model.TransactionRecordDb?.toTransactionRecord(): com.example.expensestracker.model.TransactionRecord? {
    return if (this != null) {
        com.example.expensestracker.model.TransactionRecord(
            id = id,
            amount = amount.toBigDecimal(),
            createdAt = createdAt,
            transactionId = transactionId
        )
    } else {
        null
    }
}

