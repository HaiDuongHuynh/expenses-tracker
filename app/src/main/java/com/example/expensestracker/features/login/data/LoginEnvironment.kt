package com.example.expensestracker.features.login.data

import com.example.expensestracker.foundation.datasource.preference.PreferenceManager
import com.example.expensestracker.foundation.datasource.server.ServerManager
import com.example.expensestracker.model.Credential
import com.example.expensestracker.model.User
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.merge
import kotlinx.coroutines.flow.onEach

class LoginEnvironment @Inject constructor(
    private val serverManager: ServerManager,
    private val preferenceManager: PreferenceManager
) : ILoginEnvironment {

    override fun login(email: String, password: String): Flow<Any> {
        return merge(
            serverManager.fetchCredential(),
            serverManager.fetchUser(email, password)
        ).onEach {
            when (it) {
                is Credential -> preferenceManager.setCredential(it)
                is User -> preferenceManager.setUser(it)
            }
        }
    }

}
