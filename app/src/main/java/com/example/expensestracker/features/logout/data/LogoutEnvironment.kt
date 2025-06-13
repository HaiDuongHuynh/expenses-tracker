package com.example.expensestracker.features.logout.data

import com.example.expensestracker.foundation.datasource.preference.PreferenceManager
import com.example.expensestracker.model.Credential
import com.example.expensestracker.model.User
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class LogoutEnvironment @Inject constructor(
    private val preferenceManager: PreferenceManager
) : ILogoutEnvironment {
    override suspend fun logout() {
        preferenceManager.setCredential(Credential(token = ""))
        preferenceManager.setUser(User(email = ""))
    }

    override fun getUser(): Flow<User> {
        return preferenceManager.getUser()
    }

}
