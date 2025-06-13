package com.example.expensestracker.features.localized.ui

import com.example.expensestracker.model.Language

sealed interface LocalizedEffect {
    data class ApplyLanguage(val language: Language) : LocalizedEffect
}
