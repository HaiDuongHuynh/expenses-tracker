package com.example.expensestracker.features.balance.summary.ui

import android.os.Bundle

sealed interface BalanceSummaryAction {
    data class NavBackStackEntryChanged(
        val route: String?,
        val arguments: Bundle?
    ) : BalanceSummaryAction
}
