package com.example.expensestracker.features.dashboard.ui

import androidx.compose.runtime.Immutable
import com.example.expensestracker.model.User

@Immutable
data class DashboardState(val user: User = User())
