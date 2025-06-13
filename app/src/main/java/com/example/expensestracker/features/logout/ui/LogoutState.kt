package com.example.expensestracker.features.logout.ui

import androidx.compose.runtime.Immutable
import com.example.expensestracker.model.User

@Immutable
data class LogoutState(val user: User = User())
