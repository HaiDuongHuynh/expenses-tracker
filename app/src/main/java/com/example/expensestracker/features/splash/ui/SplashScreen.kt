package com.example.expensestracker.features.splash.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.expensestracker.foundation.viewmodel.HandleEffect
import com.example.expensestracker.foundation.window.WindowState
import com.example.expensestracker.runtime.navigation.AuthFlow
import com.example.expensestracker.runtime.navigation.MainFlow
import com.example.expensestracker.runtime.navigation.OnboardingFlow
import com.example.expensestracker.runtime.navigation.home.HomeFlow

@Composable
fun SplashScreen(
    navController: NavController,
    viewModel: SplashViewModel,
    windowState: WindowState
) {
    val isDualPortrait = windowState.isDualPortrait()

    HandleEffect(
        viewModel = viewModel,
    ) {
        when (it) {
            SplashEffect.NavigateToDashboard -> {
                navController.navigate(HomeFlow.Root.route(isDualPortrait.toString())) {
                    popUpTo(MainFlow.Root.route) {
                        inclusive = true
                    }
                }
            }

            SplashEffect.NavigateToLogin -> {
                navController.navigate(AuthFlow.Root.route) {
                    popUpTo(MainFlow.Root.route) {
                        inclusive = true
                    }
                }
            }

            SplashEffect.NavigateToOnboarding -> {
                navController.navigate(OnboardingFlow.Root.route) {
                    popUpTo(MainFlow.Root.route) {
                        inclusive = true
                    }
                }
            }
        }
    }
}
