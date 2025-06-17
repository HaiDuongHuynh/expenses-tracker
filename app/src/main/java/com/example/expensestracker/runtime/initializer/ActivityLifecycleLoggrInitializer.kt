package com.example.expensestracker.runtime.initializer

import android.content.Context
import androidx.startup.Initializer
import com.example.expensestracker.foundation.liblifecycleloggr.ActivityLifecycleLoggr
import com.example.expensestracker.runtime.ExpenseTracker

class ActivityLifecycleLoggrInitializer : Initializer<ActivityLifecycleLoggr> {
    override fun create(context: Context): ActivityLifecycleLoggr {
        return ActivityLifecycleLoggr().also {
            (context.applicationContext as ExpenseTracker)
                .registerActivityLifecycleCallbacks(it)
        }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = listOf(LoggrInitializer::class.java)
}
