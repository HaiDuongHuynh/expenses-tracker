package com.example.expensestracker.runtime.navigation

import androidx.compose.material.navigation.bottomSheet
import androidx.compose.runtime.MutableState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.AccountDetailNavHost(
    navController: NavHostController,
    bottomSheetConfig: MutableState<BottomSheetConfig>
) {
    navigation(
        route = AccountDetailFlow.Root.route,
        startDestination = AccountDetailFlow.AccountDetail.route
    ) {
        composable(
            route = AccountDetailFlow.AccountDetail.route,
            arguments = AccountDetailFlow.AccountDetail.arguments
        ) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.account.detail.ui.AccountDetailViewModel>()
            com.example.expensestracker.features.account.detail.ui.AccountDetailScreen(
                viewModel = viewModel,
                onClosePage = { navController.navigateUp() },
                onCancelClick = { navController.navigateUp() },
                onCategorySectionClick = { navController.navigate(AccountDetailFlow.SelectCategory.route) }
            )
        }

        bottomSheet(AccountDetailFlow.SelectCategory.route) {
            val viewModel = if (navController.previousBackStackEntry != null) {
                hiltViewModel<com.example.expensestracker.features.account.detail.ui.AccountDetailViewModel>(
                    navController.previousBackStackEntry!!
                )
            } else {
                hiltViewModel()
            }
            bottomSheetConfig.value = DefaultBottomSheetConfig

            com.example.expensestracker.features.account.detail.ui.AccountTypeSelectionScreen(
                viewModel = viewModel,
                onClick = { navController.navigateUp() }
            )
        }
    }
}
