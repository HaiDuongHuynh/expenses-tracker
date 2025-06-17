package com.example.expensestracker.foundation.libanalyticsmanager

import com.example.expensestracker.foundation.coreanalytics.AnalyticsApi
import com.example.expensestracker.foundation.libanalyticsmanager.google.GoogleAnalytics
import javax.inject.Inject
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
class AnalyticsManager @Inject constructor(
    private val googleAnalytics: GoogleAnalytics
) : AnalyticsApi {
    override fun setUser(properties: Map<String, String>) {
        GlobalScope.launch(Dispatchers.IO) {
            googleAnalytics.setUser(properties)
        }
    }

    override fun updateUser(properties: Map<String, String>) {
        GlobalScope.launch(Dispatchers.IO) {
            googleAnalytics.updateUser(properties)
        }
    }

    override fun trackEvent(name: String) {
        GlobalScope.launch(Dispatchers.IO) {
            googleAnalytics.trackEvent(name)
        }
    }

    override fun trackEvent(name: String, properties: Map<String, String>) {
        GlobalScope.launch(Dispatchers.IO) {
            googleAnalytics.trackEvent(name, properties)
        }
    }

    override fun flush() {
        GlobalScope.launch(Dispatchers.IO) {
            googleAnalytics.flush()
        }
    }
}
