package com.wisnu.foundation.testdebug

import android.content.Context
import com.example.expensestracker.foundation.coreloggr.Logging
import okhttp3.Interceptor

object DebugTools {

    fun init() {

    }

    fun getLoggings(): List<Logging> {
        return listOf()
    }

    fun getInterceptors(context: Context): List<Interceptor> {
        return listOf()
    }

}
