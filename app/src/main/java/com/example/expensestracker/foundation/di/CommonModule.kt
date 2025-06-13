package com.example.expensestracker.foundation.di

import com.example.expensestracker.foundation.wrapper.DateTimeProvider
import com.example.expensestracker.foundation.wrapper.DateTimeProviderImpl
import com.example.expensestracker.foundation.wrapper.IdProvider
import com.example.expensestracker.foundation.wrapper.IdProviderImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CommonModule {

    @Singleton
    @Provides
    fun provideIdProvider(): IdProvider {
        return IdProviderImpl()
    }

    @Singleton
    @Provides
    fun provideDateTimeProvider(): DateTimeProvider {
        return DateTimeProviderImpl()
    }

}
