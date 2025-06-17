package com.example.expensestracker.foundation.extension

import com.example.expensestracker.foundation.datasource.preference.model.ThemePreference


fun ThemePreference.toTheme() = when (this.value) {
    com.example.expensestracker.model.Theme.LIGHT.value -> com.example.expensestracker.model.Theme.LIGHT
    com.example.expensestracker.model.Theme.TWILIGHT.value -> com.example.expensestracker.model.Theme.TWILIGHT
    com.example.expensestracker.model.Theme.NIGHT.value -> com.example.expensestracker.model.Theme.NIGHT
    com.example.expensestracker.model.Theme.SUNRISE.value -> com.example.expensestracker.model.Theme.SUNRISE
    com.example.expensestracker.model.Theme.AURORA.value -> com.example.expensestracker.model.Theme.AURORA
    com.example.expensestracker.model.Theme.WALLPAPER.value -> com.example.expensestracker.model.Theme.WALLPAPER
    else -> com.example.expensestracker.model.Theme.SYSTEM
}
