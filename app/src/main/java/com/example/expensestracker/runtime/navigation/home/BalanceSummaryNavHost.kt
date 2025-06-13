package com.example.expensestracker.runtime.navigation.home

import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.navigation

fun NavGraphBuilder.BalanceSummaryNavHost(
    mainNavController: NavController,
) {
    navigation(
        route = BalanceSummaryFlow.Root.route,
        startDestination = BalanceSummaryFlow.BalanceSummaryScreen.route
    ) {
        composable(BalanceSummaryFlow.BalanceSummaryScreen.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.balance.summary.ui.BalanceSummaryViewModel>()
            com.example.expensestracker.features.balance.summary.ui.BalanceSummaryScreen(
                viewModel = viewModel,
                route = null,
                arguments = null,
                onClickAccount = {
                    mainNavController.navigate(
                        com.example.expensestracker.runtime.navigation.AccountDetailFlow.Root.route(
                            it
                        )
                    )
                },
                onClickAddAccount = {
                    mainNavController.navigate(com.example.expensestracker.runtime.navigation.AccountDetailFlow.Root.route())
                }
            )
        }
    }
}
fun NavGraphBuilder.BalanceSummaryLeftNavHost(
    rightNavController: NavController,
) {
    navigation(
        route = BalanceSummaryFlow.Root.route,
        startDestination = BalanceSummaryFlow.BalanceSummaryScreen.route
    ) {
        composable(BalanceSummaryFlow.BalanceSummaryScreen.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.balance.summary.ui.BalanceSummaryViewModel>()
            val navBackStackEntry by rightNavController.currentBackStackEntryAsState()

            com.example.expensestracker.features.balance.summary.ui.BalanceSummaryScreen(
                viewModel = viewModel,
                route = navBackStackEntry?.destination?.route,
                arguments = navBackStackEntry?.arguments,
                onClickAccount = {
                    rightNavController.navigate(
                        com.example.expensestracker.runtime.navigation.AccountDetailFlow.Root.route(
                            it
                        )
                    ) {
                        popUpTo(TransactionSummaryFlow.RootEmpty.route)
                    }
                },
                onClickAddAccount = {
                    rightNavController.navigate(com.example.expensestracker.runtime.navigation.AccountDetailFlow.Root.route()) {
                        popUpTo(TransactionSummaryFlow.RootEmpty.route)
                    }
                }
            )
        }
    }
}
