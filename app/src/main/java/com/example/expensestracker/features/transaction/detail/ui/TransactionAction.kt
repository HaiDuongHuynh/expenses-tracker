package com.example.expensestracker.features.transaction.detail.ui

import androidx.compose.ui.text.input.TextFieldValue
import com.example.expensestracker.model.Account
import com.example.expensestracker.model.CategoryType
import com.example.expensestracker.model.TransactionType
import java.time.LocalDateTime

sealed interface TransactionAction {
    object Save : TransactionAction
    object Delete : TransactionAction
    data class SelectTransactionType(val type: TransactionType) : TransactionAction
    sealed interface TotalAmountAction : TransactionAction {
        data class Change(val totalAmount: TextFieldValue) : TotalAmountAction
    }

    data class ChangeNote(val note: TextFieldValue) : TransactionAction
    data class SelectAccount(val selectedAccount: Account) : TransactionAction
    data class SelectTransferAccount(val selectedAccount: Account) : TransactionAction
    data class SelectDate(val selectedDate: LocalDateTime?) : TransactionAction
    object DismissDatePicker : TransactionAction
    object ShowDatePicker : TransactionAction
    data class SelectCategory(val selectedCategoryType: CategoryType) : TransactionAction
}
