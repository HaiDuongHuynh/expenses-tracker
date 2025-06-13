package com.example.expensestracker.runtime.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.AuthNavHost(navController: NavHostController) {
    navigation(
        startDestination = AuthFlow.LoginScreen.route,
        route = AuthFlow.Root.route
    ) {
        composable(route = AuthFlow.LoginScreen.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.login.ui.LoginViewModel>()
            com.example.expensestracker.features.login.ui.LoginScreen(
                viewModel = viewModel,
                onLogin = {
                    navController.navigate(com.example.expensestracker.runtime.navigation.home.HomeFlow.Root.route) {
                        popUpTo(AuthFlow.LoginScreen.route) {
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}
