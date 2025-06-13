package com.example.expensestracker.foundation.extension

import androidx.compose.ui.graphics.Color
import java.math.BigDecimal

fun BigDecimal.getAmountColor(defaultColor: Color): Color {
    val zero = BigDecimal.ZERO
    return if (this > zero) {
        com.example.expensestracker.foundation.theme.Income
    } else if (this < zero) {
        com.example.expensestracker.foundation.theme.Expense
    } else {
        defaultColor
    }
}
