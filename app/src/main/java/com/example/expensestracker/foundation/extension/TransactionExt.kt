package com.example.expensestracker.foundation.extension


fun com.example.expensestracker.model.Transaction.isChanged(newTransaction: com.example.expensestracker.model.Transaction): Boolean {
    return isAmountChanged(newTransaction) ||
        categoryType != newTransaction.categoryType ||
        date != newTransaction.date ||
        note != newTransaction.note
}

fun com.example.expensestracker.model.Transaction.isAmountChanged(newTransaction: com.example.expensestracker.model.Transaction): Boolean {
    return amount != newTransaction.amount
}
