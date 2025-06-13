package com.example.expensestracker.features.transaction.detail.di

import com.example.expensestracker.features.transaction.detail.data.ITransactionDetailEnvironment
import com.example.expensestracker.features.transaction.detail.data.TransactionDetailEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class TransactionDetailModule {

    @Binds
    abstract fun provideEnvironment(
        environment: TransactionDetailEnvironment
    ): ITransactionDetailEnvironment

}
