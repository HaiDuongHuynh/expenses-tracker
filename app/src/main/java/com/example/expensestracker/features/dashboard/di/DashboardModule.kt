package com.example.expensestracker.features.dashboard.di

import com.example.expensestracker.features.dashboard.data.DashboardEnvironment
import com.example.expensestracker.features.dashboard.data.IDashboardEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DashboardModule {

    @Binds
    abstract fun provideEnvironment(
        environment: DashboardEnvironment
    ): IDashboardEnvironment

}
