package com.example.expensestracker.features.balance.summary.data

import com.example.expensestracker.model.AccountType
import com.example.expensestracker.model.Currency
import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountBalance(
    val id: String,
    val currency: Currency,
    val amount: BigDecimal,
    val name: String,
    val type: AccountType,
    val createdAt: LocalDateTime,
)
