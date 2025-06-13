package com.example.expensestracker.foundation.extension

import androidx.compose.ui.graphics.Color
import com.example.expensestracker.R

fun com.example.expensestracker.model.CategoryType.getEmojiAndText(): Pair<String, Int> {
    return when (this) {
        com.example.expensestracker.model.CategoryType.MONTHLY_FEE -> Pair(getEmoji("shopping_cart"), R.string.category_monthly_fee)
        com.example.expensestracker.model.CategoryType.ADMIN_FEE -> Pair(getEmoji("money_with_wings"), R.string.category_admin_fee)
        com.example.expensestracker.model.CategoryType.PETS -> Pair(getEmoji("cat2"), R.string.category_pets)
        com.example.expensestracker.model.CategoryType.DONATION -> Pair(getEmoji("palms_up_together"), R.string.category_donations)
        com.example.expensestracker.model.CategoryType.EDUCATION -> Pair(getEmoji("books"), R.string.category_education)
        com.example.expensestracker.model.CategoryType.FINANCIAL -> Pair(getEmoji("bank"), R.string.category_financial)
        com.example.expensestracker.model.CategoryType.ENTERTAINMENT -> Pair(getEmoji("popcorn"), R.string.category_entertainment)
        com.example.expensestracker.model.CategoryType.CHILDREN_NEEDS -> Pair(getEmoji("baby"), R.string.category_children_needs)
        com.example.expensestracker.model.CategoryType.HOUSEHOLD_NEEDS -> Pair(getEmoji("house"), R.string.category_household_needs)
        com.example.expensestracker.model.CategoryType.SPORT -> Pair(getEmoji("muscle"), R.string.category_sport)
        com.example.expensestracker.model.CategoryType.OTHERS -> Pair(getEmoji("thinking"), R.string.category_others)
        com.example.expensestracker.model.CategoryType.FOOD -> Pair(getEmoji("stew"), R.string.category_food)
        com.example.expensestracker.model.CategoryType.PARKING -> Pair(getEmoji("parking"), R.string.category_parking)
        com.example.expensestracker.model.CategoryType.FUEL -> Pair(getEmoji("fuelpump"), R.string.category_fuel)
        com.example.expensestracker.model.CategoryType.MOVIE -> Pair(getEmoji("movie_camera"), R.string.category_movie)
        com.example.expensestracker.model.CategoryType.AUTOMOTIVE -> Pair(getEmoji("blue_car"), R.string.category_automotive)
        com.example.expensestracker.model.CategoryType.TAX -> Pair(getEmoji("receipt"), R.string.category_tax)
        com.example.expensestracker.model.CategoryType.INCOME -> Pair(getEmoji("moneybag"), R.string.category_income)
        com.example.expensestracker.model.CategoryType.BUSINESS_EXPENSES -> Pair(getEmoji("briefcase"), R.string.category_business_expenses)
        com.example.expensestracker.model.CategoryType.SELF_CARE -> Pair(getEmoji("lotion_bottle"), R.string.category_self_care)
        com.example.expensestracker.model.CategoryType.LOAN -> Pair(getEmoji("credit_card"), R.string.category_loan)
        com.example.expensestracker.model.CategoryType.SERVICE -> Pair(getEmoji("hammer_and_wrench"), R.string.category_service)
        com.example.expensestracker.model.CategoryType.SHOPPING -> Pair(getEmoji("shopping"), R.string.category_shopping)
        com.example.expensestracker.model.CategoryType.BILLS -> Pair(getEmoji("bulb"), R.string.category_bills)
        com.example.expensestracker.model.CategoryType.TAXI -> Pair(getEmoji("oncoming_taxi"), R.string.category_tax)
        com.example.expensestracker.model.CategoryType.CASH_WITHDRAWAL -> Pair(getEmoji("dollar"), R.string.category_cash_withdrawal)
        com.example.expensestracker.model.CategoryType.PHONE -> Pair(getEmoji("iphone"), R.string.category_phone)
        com.example.expensestracker.model.CategoryType.TOP_UP -> Pair(getEmoji("inbox_tray"), R.string.category_top_up)
        com.example.expensestracker.model.CategoryType.PUBLIC_TRANSPORTATION -> Pair(getEmoji("bus"), R.string.category_public_transportation)
        com.example.expensestracker.model.CategoryType.TRAVEL -> Pair(getEmoji("airplane"), R.string.category_travel)
        com.example.expensestracker.model.CategoryType.UNCATEGORIZED -> Pair(getEmoji("question"), R.string.category_uncategorized)
    }
}

fun com.example.expensestracker.model.CategoryType.getColor(): Color {
    return when (this) {
        com.example.expensestracker.model.CategoryType.MONTHLY_FEE -> Color(0xFFDF1125)
        com.example.expensestracker.model.CategoryType.ADMIN_FEE -> Color(0xFFFD4154)
        com.example.expensestracker.model.CategoryType.PETS -> Color(0xFFFE4F78)
        com.example.expensestracker.model.CategoryType.DONATION -> Color(0xFF78C2FF)
        com.example.expensestracker.model.CategoryType.EDUCATION -> Color(0xFF2FD15A)
        com.example.expensestracker.model.CategoryType.FINANCIAL -> Color(0xFFFC5C42)
        com.example.expensestracker.model.CategoryType.ENTERTAINMENT -> Color(0xFFFD7036)
        com.example.expensestracker.model.CategoryType.CHILDREN_NEEDS -> Color(0xFFEDB4AD)
        com.example.expensestracker.model.CategoryType.HOUSEHOLD_NEEDS -> Color(0xFFE0694E)
        com.example.expensestracker.model.CategoryType.SPORT -> Color(0xFFCA6F59)
        com.example.expensestracker.model.CategoryType.OTHERS -> Color(0xFF0A83FE)
        com.example.expensestracker.model.CategoryType.FOOD -> Color(0xFFFC473C)
        com.example.expensestracker.model.CategoryType.PARKING -> Color(0xFF717F8A)
        com.example.expensestracker.model.CategoryType.FUEL -> Color(0xFFFFA008)
        com.example.expensestracker.model.CategoryType.MOVIE -> Color(0xFFC9A676)
        com.example.expensestracker.model.CategoryType.AUTOMOTIVE -> Color(0xFFFFEB6D)
        com.example.expensestracker.model.CategoryType.TAX -> Color(0xFF80E220)
        com.example.expensestracker.model.CategoryType.INCOME -> Color(0xFF77EA7E)
        com.example.expensestracker.model.CategoryType.BUSINESS_EXPENSES -> Color(0xFFA2EC8E)
        com.example.expensestracker.model.CategoryType.SELF_CARE -> Color(0xFF1EA5FC)
        com.example.expensestracker.model.CategoryType.LOAN -> Color(0xFF1871AC)
        com.example.expensestracker.model.CategoryType.SERVICE -> Color(0xFFF29C98)
        com.example.expensestracker.model.CategoryType.SHOPPING -> Color(0xFF383B65)
        com.example.expensestracker.model.CategoryType.BILLS -> Color(0xFF5F41B2)
        com.example.expensestracker.model.CategoryType.TAXI -> Color(0xFF578887)
        com.example.expensestracker.model.CategoryType.CASH_WITHDRAWAL -> Color(0xFF7A6E49)
        com.example.expensestracker.model.CategoryType.PHONE -> Color(0xFF715D50)
        com.example.expensestracker.model.CategoryType.TOP_UP -> Color(0xFFFFD408)
        com.example.expensestracker.model.CategoryType.PUBLIC_TRANSPORTATION -> Color(0xFF383B65)
        com.example.expensestracker.model.CategoryType.TRAVEL -> Color(0xFFD8C9AF)
        com.example.expensestracker.model.CategoryType.UNCATEGORIZED -> Color(0xFF788991)
    }
}

private fun getEmoji(key: String): String {
    return com.example.expensestracker.foundation.emoji.EmojiData.DATA[key] ?: throw Exception("Emoji for $key not found!")
}
