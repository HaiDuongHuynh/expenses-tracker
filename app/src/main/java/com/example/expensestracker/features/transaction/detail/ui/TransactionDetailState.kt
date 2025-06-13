package com.example.expensestracker.features.transaction.detail.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import com.example.expensestracker.foundation.extension.ZERO_AMOUNT
import com.example.expensestracker.foundation.extension.defaultAccount
import com.example.expensestracker.foundation.extension.formatAsBigDecimal
import com.example.expensestracker.foundation.extension.formatAsDisplayNormalize
import com.example.expensestracker.foundation.theme.Expense
import com.example.expensestracker.foundation.theme.Income
import com.example.expensestracker.foundation.wrapper.DateTimeProviderImpl
import com.example.expensestracker.model.Account
import com.example.expensestracker.model.CategoryType
import com.example.expensestracker.model.Currency
import com.example.expensestracker.model.TransactionType
import com.wisnu.foundation.coredatetime.formatDateTime
import com.example.expensestracker.R
import java.math.BigDecimal
import java.time.LocalDateTime

@Immutable
data class TransactionState(
    val transactionType: TransactionType = TransactionType.EXPENSE,
    val accounts: List<Account> = listOf(),
    val selectedAccount: Account = defaultAccount(
        Currency.Companion.DEFAULT,
        DateTimeProviderImpl().now()
    ),
    val selectedTransferAccount: Account? = null,
    val categories: Map<Int, List<CategoryType>> = mapOf(),
    val categoryType: CategoryType = CategoryType.OTHERS,
    val totalAmount: TextFieldValue = TextFieldValue(text = ZERO_AMOUNT),
    val note: TextFieldValue = TextFieldValue(),
    val currency: Currency = Currency.Companion.DEFAULT,
    val transactionDate: LocalDateTime = DateTimeProviderImpl().now(),
    val transactionCreatedAt: LocalDateTime = DateTimeProviderImpl().now(),
    val transactionUpdatedAt: LocalDateTime? = null,
    val isEditMode: Boolean = false,
    val showDatePicker: Boolean = false,
)

// Collections
@Composable
fun TransactionState.getTitle(): String {
    return if (isEditMode) {
        when (transactionType) {
            TransactionType.INCOME -> stringResource(R.string.transaction_edit_income)
            TransactionType.EXPENSE -> stringResource(R.string.transaction_edit_expense)
            TransactionType.TRANSFER -> stringResource(R.string.transaction_edit_transfer)
        }
    } else {
        stringResource(R.string.transaction_edit_add)
    }
}

fun TransactionState.isValid(): Boolean {
    val isTotalAmountNotZero = totalAmount.formatAsBigDecimal() > BigDecimal.ZERO
    return when (transactionType) {
        TransactionType.INCOME -> {
            isTotalAmountNotZero
        }
        TransactionType.EXPENSE -> {
            isTotalAmountNotZero
        }
        TransactionType.TRANSFER -> {
            val isTransferAccountNotEmpty = if (isEditMode) {
                true
            } else {
                selectedTransferAccount != null
            }

            isTotalAmountNotZero && isTransferAccountNotEmpty
        }
    }
}

fun TransactionState.selectedAccountName() = selectedAccount.name

fun TransactionState.hasTransferAccount(): Boolean {
    return selectedTransferAccount != null
}

@Composable
fun TransactionState.selectedAccountTransferName(): String {
    val selectedAccount = selectedTransferAccount
    return if (isEditMode) {
        selectedAccount?.name ?: stringResource(R.string.transaction_account_deleted)
    } else {
        selectedAccount?.name.orEmpty()
    }
}

fun TransactionState.transactionDateDisplayable() = transactionDate.formatDateTime()

fun TransactionState.noteHintDisplayable() = when (transactionType) {
    TransactionType.INCOME -> R.string.transaction_edit_note_income_hint
    TransactionType.EXPENSE -> R.string.transaction_edit_note_expense_hint
    TransactionType.TRANSFER -> R.string.transaction_edit_note_transfer_hint
}

fun TransactionState.getAmountDisplay(): String {
    val amount = if (transactionType == TransactionType.EXPENSE) {
        "-" + totalAmount.text
    } else {
        totalAmount.text
    }
    return currency.formatAsDisplayNormalize(amount.toBigDecimal(), true)
}

fun TransactionState.getAmountColor(defaultColor: Color): Color {
    return when (transactionType) {
        TransactionType.INCOME -> Income
        TransactionType.EXPENSE -> Expense
        TransactionType.TRANSFER -> defaultColor
    }
}

fun TransactionType.getTitle(): Int {
    return when(this) {
        TransactionType.INCOME -> R.string.transaction_income
        TransactionType.EXPENSE -> R.string.transaction_expense
        TransactionType.TRANSFER -> R.string.transaction_transfer
    }
}

fun getTransactionTypes(): List<TransactionType> {
    return listOf(
        TransactionType.EXPENSE,
        TransactionType.INCOME,
        TransactionType.TRANSFER
    )
}

fun getCategoryTypes(): List<CategoryType> {
    return listOf(
        CategoryType.MONTHLY_FEE,
        CategoryType.ADMIN_FEE,
        CategoryType.PETS,
        CategoryType.DONATION,
        CategoryType.EDUCATION,
        CategoryType.FINANCIAL,
        CategoryType.ENTERTAINMENT,
        CategoryType.CHILDREN_NEEDS,
        CategoryType.HOUSEHOLD_NEEDS,
        CategoryType.SPORT,
        CategoryType.OTHERS,
        CategoryType.FOOD,
        CategoryType.PARKING,
        CategoryType.FUEL,
        CategoryType.MOVIE,
        CategoryType.AUTOMOTIVE,
        CategoryType.TAX,
        CategoryType.INCOME,
        CategoryType.BUSINESS_EXPENSES,
        CategoryType.SELF_CARE,
        CategoryType.LOAN,
        CategoryType.SERVICE,
        CategoryType.SHOPPING,
        CategoryType.BILLS,
        CategoryType.TAXI,
        CategoryType.CASH_WITHDRAWAL,
        CategoryType.PHONE,
        CategoryType.TOP_UP,
        CategoryType.PUBLIC_TRANSPORTATION,
        CategoryType.TRAVEL,
        CategoryType.UNCATEGORIZED,
    )
}
