package com.example.expensestracker.runtime.navigation

import androidx.compose.material.navigation.bottomSheet
import androidx.compose.runtime.MutableState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation


fun NavGraphBuilder.TransactionDetailNavHost(
    navController: NavHostController,
    bottomSheetConfig: MutableState<BottomSheetConfig>
) {
    navigation(
        route = TransactionDetailFlow.Root.route,
        startDestination = TransactionDetailFlow.TransactionDetail.route,
    ) {
        composable(
            route = TransactionDetailFlow.TransactionDetail.route,
            arguments = TransactionDetailFlow.TransactionDetail.arguments
        ) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.transaction.detail.ui.TransactionDetailViewModel>()
            com.example.expensestracker.features.transaction.detail.ui.TransactionDetailScreen(
                viewModel = viewModel,
                onClosePage = { navController.navigateUp() },
                onCancelClick = { navController.navigateUp() },
                onAccountSectionClick = { navController.navigate(TransactionDetailFlow.SelectAccount.route) },
                onAddAccountClick = { navController.navigate(AccountDetailFlow.Root.route()) },
                onCategorySectionClick = { navController.navigate(TransactionDetailFlow.SelectCategory.route) },
                onTransferAccountSectionClick = { navController.navigate(TransactionDetailFlow.SelectTransferAccount.route) }
            )
        }

        bottomSheet(TransactionDetailFlow.SelectAccount.route) {
            val viewModel = if (navController.previousBackStackEntry != null) {
                hiltViewModel<com.example.expensestracker.features.transaction.detail.ui.TransactionDetailViewModel>(
                    navController.previousBackStackEntry!!
                )
            } else {
                hiltViewModel()
            }
            bottomSheetConfig.value = DefaultBottomSheetConfig

            com.example.expensestracker.features.transaction.detail.ui.AccountSelectionScreen(
                viewModel = viewModel,
                onClick = { navController.navigateUp() },
            )
        }

        bottomSheet(TransactionDetailFlow.SelectTransferAccount.route) {
            val viewModel = if (navController.previousBackStackEntry != null) {
                hiltViewModel<com.example.expensestracker.features.transaction.detail.ui.TransactionDetailViewModel>(
                    navController.previousBackStackEntry!!
                )
            } else {
                hiltViewModel()
            }
            bottomSheetConfig.value = DefaultBottomSheetConfig

            com.example.expensestracker.features.transaction.detail.ui.TransferAccountSelectionScreen(
                viewModel = viewModel,
                onClick = { navController.navigateUp() },
            )
        }

        bottomSheet(TransactionDetailFlow.SelectCategory.route) {
            val viewModel = if (navController.previousBackStackEntry != null) {
                hiltViewModel<com.example.expensestracker.features.transaction.detail.ui.TransactionDetailViewModel>(
                    navController.previousBackStackEntry!!
                )
            } else {
                hiltViewModel()
            }
            bottomSheetConfig.value = DefaultBottomSheetConfig

            com.example.expensestracker.features.transaction.detail.ui.CategorySelectionScreen(
                viewModel = viewModel,
                onClick = { navController.navigateUp() }
            )
        }
    }
}
