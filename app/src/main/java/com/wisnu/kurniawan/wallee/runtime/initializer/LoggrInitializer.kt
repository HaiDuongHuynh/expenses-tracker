package com.wisnu.kurniawan.wallee.runtime.initializer

import android.content.Context
import androidx.startup.Initializer
import com.wisnu.kurniawan.coreLogger.Loggr
import com.wisnu.kurniawan.testDebug.DebugTools
import com.wisnu.kurniawan.wallee.foundation.analytic.crash.CrashLogging

class LoggrInitializer : Initializer<Loggr> {
    override fun create(context: Context): Loggr {
        val loggings = DebugTools.getLoggings().toMutableList()
        loggings.add(CrashLogging())
        Loggr.initialize(loggings)
        return Loggr
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
