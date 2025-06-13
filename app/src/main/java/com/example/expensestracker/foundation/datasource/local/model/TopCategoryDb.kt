package com.example.expensestracker.foundation.datasource.local.model

import com.example.expensestracker.model.CategoryType

data class TopCategoryDb(
    val type: CategoryType,
    val total: Int,
)
