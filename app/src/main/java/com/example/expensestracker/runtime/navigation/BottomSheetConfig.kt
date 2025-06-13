package com.example.expensestracker.runtime.navigation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Shape


@Immutable
data class BottomSheetConfig(
    val sheetShape: Shape,
    val showScrim: Boolean
)

val DefaultBottomSheetConfig = BottomSheetConfig(
    RoundedCornerShape(
        topStart = com.example.expensestracker.foundation.theme.LargeRadius,
        topEnd = com.example.expensestracker.foundation.theme.LargeRadius
    ),
    true
)
val NoScrimMainBottomSheetConfig = BottomSheetConfig(
    RoundedCornerShape(
        topStart = com.example.expensestracker.foundation.theme.LargeRadius,
        topEnd = com.example.expensestracker.foundation.theme.LargeRadius
    ),
    false
)
val NoScrimSmallShapeMainBottomSheetConfig = BottomSheetConfig(
    RoundedCornerShape(
        topStart = com.example.expensestracker.foundation.theme.SmallRadius,
        topEnd = com.example.expensestracker.foundation.theme.SmallRadius
    ),
    false
)

