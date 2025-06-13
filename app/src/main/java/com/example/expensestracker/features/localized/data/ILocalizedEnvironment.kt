package com.example.expensestracker.features.localized.data

import com.example.expensestracker.model.Language
import kotlinx.coroutines.flow.Flow

interface ILocalizedEnvironment {
    fun getLanguage(): Flow<Language>
    suspend fun setLanguage(language: Language)
}

