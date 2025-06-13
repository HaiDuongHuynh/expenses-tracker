package com.example.expensestracker.features.host.data

import com.example.expensestracker.foundation.datasource.preference.PreferenceManager
import com.example.expensestracker.model.Theme
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class HostEnvironment @Inject constructor(
    private val preferenceManager: PreferenceManager
) : IHostEnvironment {

    override fun getTheme(): Flow<Theme> {
        return preferenceManager.getTheme()
    }

}
