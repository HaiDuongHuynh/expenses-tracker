package com.wisnu.kurniawan.wallee.foundation.analytic

interface AnalyticsApi {
    fun setUser(properties: Map<String, String>)
    fun updateUser(properties: Map<String, String>)
    fun trackEvent(name: String)
    fun trackEvent(name: String, properties: Map<String, String>)
    fun flush()
}
