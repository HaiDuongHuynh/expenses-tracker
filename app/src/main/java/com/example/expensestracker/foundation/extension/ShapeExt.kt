package com.example.expensestracker.foundation.extension

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.RectangleShape

fun cellShape(index: Int, size: Int) = when {
    // Single item
    size == 1 -> {
        RoundedCornerShape(size = com.example.expensestracker.foundation.theme.MediumRadius)
    }
    // First index
    index == 0 -> {
        RoundedCornerShape(
            topStart = com.example.expensestracker.foundation.theme.MediumRadius,
            topEnd = com.example.expensestracker.foundation.theme.MediumRadius
        )
    }
    // Last index
    index == size - 1 -> {
        RoundedCornerShape(
            bottomStart = com.example.expensestracker.foundation.theme.MediumRadius,
            bottomEnd = com.example.expensestracker.foundation.theme.MediumRadius
        )
    }
    // Middle items
    else -> {
        RectangleShape
    }
}

fun shouldShowDivider(index: Int, size: Int): Boolean {
    // Don't show divider if the item only 1 and last item
    return if (size != 1) {
        // Show divider if first or middle item
        index == 0 || index < size - 1
    } else {
        false
    }
}
