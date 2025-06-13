package com.example.expensestracker.features.dashboard.data

import com.example.expensestracker.foundation.datasource.preference.PreferenceManager
import com.example.expensestracker.model.User
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class DashboardEnvironment @Inject constructor(
    private val preferenceManager: PreferenceManager,
) : IDashboardEnvironment {

    override fun getUser(): Flow<User> {
        return preferenceManager.getUser()
    }

}
