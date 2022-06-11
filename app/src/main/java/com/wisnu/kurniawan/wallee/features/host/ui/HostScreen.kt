package com.wisnu.kurniawan.wallee.features.host.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.wisnu.kurniawan.wallee.foundation.theme.Theme

@Composable
fun Host(content: @Composable () -> Unit) {
    val viewModel = hiltViewModel<HostViewModel>()
    val state by viewModel.state.collectAsState()

    Theme(theme = state.theme, content = content)
}
