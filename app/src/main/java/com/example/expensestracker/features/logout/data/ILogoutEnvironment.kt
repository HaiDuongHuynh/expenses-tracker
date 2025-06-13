package com.example.expensestracker.features.logout.data

import com.example.expensestracker.model.User
import kotlinx.coroutines.flow.Flow

interface ILogoutEnvironment {
    suspend fun logout()
    fun getUser(): Flow<User>
}
