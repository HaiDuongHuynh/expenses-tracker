package com.example.expensestracker.runtime.navigation.home

import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.navigation


fun NavGraphBuilder.TransactionSummaryNavHost(
    mainNavController: NavController,
    navController: NavController,
) {
    navigation(
        route = TransactionSummaryFlow.Root.route,
        startDestination = TransactionSummaryFlow.TransactionSummaryScreen.route
    ) {
        composable(TransactionSummaryFlow.TransactionSummaryScreen.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.transaction.summary.ui.TransactionSummaryViewModel>()
            com.example.expensestracker.features.transaction.summary.ui.TransactionSummaryScreen(
                viewModel = viewModel,
                route = null,
                arguments = null,
                onSettingClick = { mainNavController.navigate(com.example.expensestracker.runtime.navigation.SettingFlow.Root.route) },
                onClickAddTransaction = { mainNavController.navigate(com.example.expensestracker.runtime.navigation.TransactionDetailFlow.Root.route()) },
                onLastTransactionItemClick = {
                    mainNavController.navigate(
                        com.example.expensestracker.runtime.navigation.TransactionDetailFlow.Root.route(
                            it
                        )
                    )
                },
                onSeeMoreLastTransactionClick = { navController.navigate(TransactionSummaryFlow.AllTransactionScreen.route) },
                onSeeMoreTopExpenseClick = { navController.navigate(TransactionSummaryFlow.TopExpenseScreen.route) }
            )
        }
        composable(TransactionSummaryFlow.AllTransactionScreen.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.transaction.all.ui.AllTransactionViewModel>()
            com.example.expensestracker.features.transaction.all.ui.AllTransactionScreen(
                viewModel = viewModel,
                onTransactionItemClick = {
                    mainNavController.navigate(
                        com.example.expensestracker.runtime.navigation.TransactionDetailFlow.Root.route(
                            it
                        )
                    )
                }
            )
        }
        composable(TransactionSummaryFlow.TopExpenseScreen.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.transaction.topexpense.ui.TopExpenseViewModel>()
            com.example.expensestracker.features.transaction.topexpense.ui.TopExpenseScreen(
                viewModel = viewModel
            )
        }
    }
}

fun NavGraphBuilder.TransactionSummaryLeftNavHost(
    mainNavController: NavController,
    rightNavController: NavController,
) {
    navigation(
        route = TransactionSummaryFlow.Root.route,
        startDestination = TransactionSummaryFlow.TransactionSummaryScreen.route
    ) {
        composable(TransactionSummaryFlow.TransactionSummaryScreen.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.transaction.summary.ui.TransactionSummaryViewModel>()
            val navBackStackEntry by rightNavController.currentBackStackEntryAsState()

            com.example.expensestracker.features.transaction.summary.ui.TransactionSummaryScreen(
                viewModel = viewModel,
                route = navBackStackEntry?.destination?.route,
                arguments = navBackStackEntry?.arguments,
                onSettingClick = { mainNavController.navigate(com.example.expensestracker.runtime.navigation.SettingFlow.Root.route) },
                onClickAddTransaction = {
                    rightNavController.navigate(com.example.expensestracker.runtime.navigation.TransactionDetailFlow.Root.route()) {
                        popUpTo(TransactionSummaryFlow.RootEmpty.route)
                    }
                },
                onSeeMoreLastTransactionClick = {
                    rightNavController.navigate(TransactionSummaryFlow.RootAllTransaction.route) {
                        popUpTo(TransactionSummaryFlow.RootEmpty.route)
                    }
                },
                onLastTransactionItemClick = {
                    rightNavController.navigate(
                        com.example.expensestracker.runtime.navigation.TransactionDetailFlow.Root.route(
                            it
                        )
                    ) {
                        popUpTo(TransactionSummaryFlow.RootEmpty.route)
                    }
                },
                onSeeMoreTopExpenseClick = {
                    rightNavController.navigate(TransactionSummaryFlow.RootTopExpense.route) {
                        popUpTo(TransactionSummaryFlow.RootEmpty.route)
                    }
                }
            )
        }
    }
}

fun NavGraphBuilder.TopExpenseScreenRightNavHost() {
    navigation(
        route = TransactionSummaryFlow.RootTopExpense.route,
        startDestination = TransactionSummaryFlow.TopExpenseScreen.route
    ) {
        composable(TransactionSummaryFlow.TopExpenseScreen.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.transaction.topexpense.ui.TopExpenseViewModel>()
            com.example.expensestracker.features.transaction.topexpense.ui.TopExpenseScreen(
                viewModel = viewModel
            )
        }
    }
}

fun NavGraphBuilder.AllTransactionScreenRightNavHost(
    rightNavController: NavController,
) {
    navigation(
        route = TransactionSummaryFlow.RootAllTransaction.route,
        startDestination = TransactionSummaryFlow.AllTransactionScreen.route
    ) {
        composable(TransactionSummaryFlow.AllTransactionScreen.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.transaction.all.ui.AllTransactionViewModel>()
            com.example.expensestracker.features.transaction.all.ui.AllTransactionScreen(
                viewModel = viewModel,
                onTransactionItemClick = {
                    rightNavController.navigate(
                        com.example.expensestracker.runtime.navigation.TransactionDetailFlow.Root.route(
                            it
                        )
                    )
                },
            )
        }
    }
}
