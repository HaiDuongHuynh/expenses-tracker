package com.example.expensestracker.runtime

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Surface
import androidx.core.view.WindowCompat
import com.example.expensestracker.foundation.window.rememberWindowState
import com.example.expensestracker.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : androidx.appcompat.app.AppCompatActivity() {
    private lateinit var windowState: com.example.expensestracker.foundation.window.WindowState

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Wallee_Light)
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            windowState = rememberWindowState()

            com.example.expensestracker.features.host.ui.Host {
                Surface {
                    com.example.expensestracker.runtime.navigation.MainNavHost(windowState)
                }
            }
        }
    }
}
