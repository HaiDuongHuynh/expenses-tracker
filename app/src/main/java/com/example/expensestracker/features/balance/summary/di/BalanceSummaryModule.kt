package com.example.expensestracker.features.balance.summary.di

import com.example.expensestracker.features.balance.summary.data.BalanceSummaryEnvironment
import com.example.expensestracker.features.balance.summary.data.IBalanceSummaryEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class BalanceSummaryModule {

    @Binds
    abstract fun provideEnvironment(
        environment: BalanceSummaryEnvironment
    ): IBalanceSummaryEnvironment

}
