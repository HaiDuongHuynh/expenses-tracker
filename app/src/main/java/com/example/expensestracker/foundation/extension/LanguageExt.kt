package com.example.expensestracker.foundation.extension

import com.wisnu.kurniawan.expensestracker.foundation.datasource.preference.model.LanguagePreference

fun LanguagePreference.toLanguage(): com.example.expensestracker.model.Language {
    return when (this.code) {
        com.example.expensestracker.model.Language.INDONESIA.code -> com.example.expensestracker.model.Language.INDONESIA
        else -> com.example.expensestracker.model.Language.ENGLISH
    }
}
