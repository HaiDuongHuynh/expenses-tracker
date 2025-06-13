package com.example.expensestracker.foundation.extension

import com.example.expensestracker.R
import java.math.BigDecimal
import java.time.LocalDateTime

fun com.example.expensestracker.model.AccountType.getLabel(): Int {
    return when (this) {
        com.example.expensestracker.model.AccountType.E_WALLET -> R.string.account_e_wallet
        com.example.expensestracker.model.AccountType.BANK -> R.string.account_bank
        com.example.expensestracker.model.AccountType.CASH -> R.string.account_cash
        com.example.expensestracker.model.AccountType.INVESTMENT -> R.string.account_investment
        com.example.expensestracker.model.AccountType.OTHERS -> R.string.account_others
    }
}

fun List<com.example.expensestracker.model.Account>.getDefaultAccount(): com.example.expensestracker.model.Account {
    return find { it.id == DEFAULT_ACCOUNT_ID }!!
}

fun com.example.expensestracker.model.Account.isChanged(newAccount: com.example.expensestracker.model.Account): Boolean {
    return isAmountChanged(newAccount) ||
        type != newAccount.type ||
        name != newAccount.name
}

fun com.example.expensestracker.model.Account.isAmountChanged(newAccount: com.example.expensestracker.model.Account): Boolean {
    return amount != newAccount.amount
}

fun List<com.example.expensestracker.model.Account>.select(except: com.example.expensestracker.model.Account): com.example.expensestracker.model.Account? {
    return firstOrNull { it.id != except.id }
}

fun defaultAccount(currency: com.example.expensestracker.model.Currency, createdAt: LocalDateTime) =
    com.example.expensestracker.model.Account(
        id = DEFAULT_ACCOUNT_ID,
        currency = currency,
        amount = BigDecimal.ZERO,
        name = "Cash",
        type = com.example.expensestracker.model.AccountType.CASH,
        createdAt = createdAt,
        updatedAt = null,
        transactions = listOf()
    )
