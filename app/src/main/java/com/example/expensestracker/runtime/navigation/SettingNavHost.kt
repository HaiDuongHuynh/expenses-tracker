package com.example.expensestracker.runtime.navigation

import androidx.compose.material.navigation.bottomSheet
import androidx.compose.runtime.MutableState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation

fun NavGraphBuilder.SettingNavHost(
    navController: NavHostController,
    bottomSheetConfig: MutableState<BottomSheetConfig>
) {
    navigation(startDestination = SettingFlow.Setting.route, route = SettingFlow.Root.route) {
        bottomSheet(SettingFlow.Setting.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.setting.ui.SettingViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            com.example.expensestracker.features.setting.ui.SettingScreen(
                viewModel = viewModel,
                onClick = { navController.navigate(it) }
            )
        }
        bottomSheet(SettingFlow.Theme.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.theme.ui.ThemeViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            com.example.expensestracker.features.theme.ui.ThemeScreen(
                viewModel = viewModel,
                onClickBack = { navController.navigateUp() }
            )
        }
        bottomSheet(SettingFlow.Logout.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.logout.ui.LogoutViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            com.example.expensestracker.features.logout.ui.LogoutScreen(
                viewModel = viewModel,
                onClickBack = {
                    navController.navigateUp()
                },
                onLogout = {
                    navController.navigate(MainFlow.Root.route) {
                        popUpTo(com.example.expensestracker.runtime.navigation.home.HomeFlow.DashboardScreen.route) {
                            inclusive = true
                        }
                    }
                }
            )
        }
        bottomSheet(SettingFlow.Language.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.localized.ui.LocalizedViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            com.example.expensestracker.features.localized.ui.LanguageScreen(
                viewModel = viewModel,
                onClickBack = { navController.navigateUp() }
            )
        }
    }
}
