package com.example.expensestracker.features.host.data

import com.example.expensestracker.model.Theme
import kotlinx.coroutines.flow.Flow

interface IHostEnvironment {
    fun getTheme(): Flow<Theme>
}
