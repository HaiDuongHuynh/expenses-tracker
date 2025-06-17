package com.example.expensestracker.foundation.libanalyticsmanager.crash

import android.util.Log
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase
import com.example.expensestracker.foundation.coreloggr.Logging

class CrashLogging : Logging {
    override fun log(priority: Int, tag: String, message: String, throwable: Throwable?) {
        if (priority == Log.ASSERT) {
            Firebase.crashlytics.log(message)
            if (throwable != null) {
                Firebase.crashlytics.recordException(throwable)
            }
        }
    }
}
