package com.example.expensestracker.runtime.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
fun NavGraphBuilder.OnboardingNavHost(navController: NavHostController) {
    navigation(
        route = OnboardingFlow.Root.route,
        startDestination = OnboardingFlow.OnboardingScreen.route,
    ) {
        composable(route = OnboardingFlow.OnboardingScreen.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.onboarding.ui.OnboardingViewModel>()
            com.example.expensestracker.features.onboarding.ui.OnboardingScreen(
                viewModel = viewModel,
                onClosePage = {
                    navController.navigate(com.example.expensestracker.runtime.navigation.home.HomeFlow.Root.route) {
                        popUpTo(OnboardingFlow.Root.route) {
                            inclusive = true
                        }
                    }
                },
                onSettingClick = {
                    navController.navigate(SettingFlow.Root.route)
                }
            )
        }
    }
}
