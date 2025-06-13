package com.example.expensestracker.features.transaction.summary.di

import com.example.expensestracker.features.transaction.summary.data.ITransactionSummaryEnvironment
import com.example.expensestracker.features.transaction.summary.data.TransactionSummaryEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class TransactionSummaryModule {

    @Binds
    abstract fun provideEnvironment(
        environment: TransactionSummaryEnvironment
    ): ITransactionSummaryEnvironment

}
