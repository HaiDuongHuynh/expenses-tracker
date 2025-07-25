package com.example.expensestracker.runtime.navigation.home

import androidx.navigation.navArgument

sealed class HomeFlow(val name: String) {
    object Root : HomeFlow("home-root") {
        val route = "$name?${com.example.expensestracker.runtime.navigation.ARG_IS_DUAL_PORTRAIT}={${com.example.expensestracker.runtime.navigation.ARG_IS_DUAL_PORTRAIT}}"

        fun route(isDualPortrait: String): String {
            return "$name?${com.example.expensestracker.runtime.navigation.ARG_IS_DUAL_PORTRAIT}=${isDualPortrait}"
        }
    }

    object DashboardScreen : HomeFlow("dashboard-screen") {
        val arguments = listOf(
            navArgument(com.example.expensestracker.runtime.navigation.ARG_IS_DUAL_PORTRAIT) {
                defaultValue = ""
            }
        )

        val route = "$name?${com.example.expensestracker.runtime.navigation.ARG_IS_DUAL_PORTRAIT}={${com.example.expensestracker.runtime.navigation.ARG_IS_DUAL_PORTRAIT}}"
    }
}

sealed class BalanceSummaryFlow(val name: String) {
    object Root : BalanceSummaryFlow("balance-summary-root") {
        val route = name
    }

    object BalanceSummaryScreen : BalanceSummaryFlow("balance-summary-screen") {
        val route = name
    }
}


sealed class TransactionSummaryFlow(val name: String) {
    object Root : TransactionSummaryFlow("transaction-summary-root") {
        val route = name
    }

    object RootEmpty : TransactionSummaryFlow("transaction-summary-root-empty") {
        val route = name
    }

    object TransactionSummaryScreen : TransactionSummaryFlow("transaction-summary-screen") {
        val route = name
    }

    object RootAllTransaction : TransactionSummaryFlow("all-transaction-root") {
        val route = name
    }

    object AllTransactionScreen : TransactionSummaryFlow("all-transaction-screen") {
        val route = name
    }

    object RootTopExpense : TransactionSummaryFlow("top-expense-root") {
        val route = name
    }

    object TopExpenseScreen : TransactionSummaryFlow("top-expense-screen") {
        val route = name
    }
}


