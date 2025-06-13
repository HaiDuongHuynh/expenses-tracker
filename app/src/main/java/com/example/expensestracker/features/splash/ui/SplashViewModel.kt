package com.example.expensestracker.features.splash.ui

import androidx.lifecycle.viewModelScope
import com.example.expensestracker.features.splash.data.ISplashEnvironment
import com.wisnu.foundation.coreviewmodel.StatefulViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class SplashViewModel @Inject constructor(
    splashEnvironment: ISplashEnvironment
) : StatefulViewModel<Unit, SplashEffect, SplashAction, ISplashEnvironment>(Unit, splashEnvironment) {

    init {
        dispatch(SplashAction.AppLaunch)
    }

    override fun dispatch(action: SplashAction) {
        when (action) {
            is SplashAction.AppLaunch -> {
                viewModelScope.launch {
//                    environment.getCredential()
//                        .collect {
                            // if (it.isLoggedIn()) {
//                            setEffect(SplashEffect.NavigateToDashboard)
//                            } else {
//                                setEffect(SplashEffect.NavigateToLogin)
//                            }
//                        }

                    environment.hasFinishOnboarding()
                        .collect {
                            if (it) {
                                setEffect(SplashEffect.NavigateToDashboard)
                            } else {
                                setEffect(SplashEffect.NavigateToOnboarding)
                            }
                        }
                }
            }
        }
    }
}

