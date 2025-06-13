package com.example.expensestracker.features.dashboard.data

import com.example.expensestracker.model.User
import kotlinx.coroutines.flow.Flow

interface IDashboardEnvironment {
    fun getUser(): Flow<User>
}
