package com.example.expensestracker.features.host.ui

import com.example.expensestracker.model.Theme
import javax.annotation.concurrent.Immutable

@Immutable
data class HostState(val theme: Theme = Theme.SYSTEM)
