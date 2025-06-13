package com.example.expensestracker.foundation.extension


fun com.example.expensestracker.model.Credential.isLoggedIn() = token.isNotBlank()
