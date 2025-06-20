package com.example.expensestracker.runtime.navigation

import androidx.compose.material.ModalBottomSheetDefaults
import androidx.compose.material.navigation.BottomSheetNavigator
import androidx.compose.material.navigation.ModalBottomSheetLayout
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.expensestracker.runtime.navigation.home.HomeNavHost
import com.example.expensestracker.runtime.navigation.home.LargeHomeNavHost

const val MinLargeScreenWidth = 585

@Composable
fun MainNavHost(windowState: com.example.expensestracker.foundation.window.WindowState) {
    val bottomSheetNavigator =
        com.example.expensestracker.foundation.uiextension.rememberBottomSheetNavigator()
    val bottomSheetConfig = remember { mutableStateOf(DefaultBottomSheetConfig) }

    val smallestScreenWidthDp = LocalConfiguration.current.smallestScreenWidthDp

    val isLargeScreen = smallestScreenWidthDp > MinLargeScreenWidth

    ModalBottomSheetLayout(
        bottomSheetNavigator = bottomSheetNavigator,
        sheetShape = bottomSheetConfig.value.sheetShape,
        scrimColor = if (bottomSheetConfig.value.showScrim) {
            ModalBottomSheetDefaults.scrimColor
        } else {
            Color.Transparent
        }
    ) {
        if (isLargeScreen) {
            LargeScreenNavHost(bottomSheetNavigator, bottomSheetConfig, windowState)
        } else {
            SmallScreenNavHost(bottomSheetNavigator, bottomSheetConfig, windowState)
        }
    }
}

@Composable
private fun SmallScreenNavHost(
    bottomSheetNavigator: BottomSheetNavigator,
    bottomSheetConfig: MutableState<BottomSheetConfig>,
    windowState: com.example.expensestracker.foundation.window.WindowState
) {
    val navController = rememberNavController(bottomSheetNavigator)
    NavHost(
        navController = navController,
        startDestination = MainFlow.Root.route
    ) {
        composable(route = MainFlow.Root.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.splash.ui.SplashViewModel>()
            com.example.expensestracker.features.splash.ui.SplashScreen(
                navController = navController,
                viewModel = viewModel,
                windowState = windowState
            )
        }

        AuthNavHost(navController)

        OnboardingNavHost(navController)

        HomeNavHost(navController)

        TransactionDetailNavHost(navController, bottomSheetConfig)

        AccountDetailNavHost(navController, bottomSheetConfig)

        SettingNavHost(navController, bottomSheetConfig)
    }
}

@Composable
private fun LargeScreenNavHost(
    bottomSheetNavigator: BottomSheetNavigator,
    bottomSheetConfig: MutableState<BottomSheetConfig>,
    windowState: com.example.expensestracker.foundation.window.WindowState
) {
    val navController = rememberNavController(bottomSheetNavigator)
    NavHost(
        navController = navController,
        startDestination = MainFlow.Root.route
    ) {
        composable(route = MainFlow.Root.route) {
            val viewModel = hiltViewModel<com.example.expensestracker.features.splash.ui.SplashViewModel>()
            com.example.expensestracker.features.splash.ui.SplashScreen(
                navController = navController,
                viewModel = viewModel,
                windowState = windowState
            )
        }

        AuthNavHost(navController)

        OnboardingNavHost(navController)

        LargeHomeNavHost(navController)

        SettingNavHost(navController, bottomSheetConfig)
    }
}
