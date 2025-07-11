package com.example.expensestracker.foundation.uiextension

fun lerp(
    startValue: Float,
    endValue: Float,
    fraction: Float
) = startValue + fraction * (endValue - startValue)
