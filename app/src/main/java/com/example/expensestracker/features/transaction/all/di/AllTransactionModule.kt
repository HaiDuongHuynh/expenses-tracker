package com.example.expensestracker.features.transaction.all.di

import com.example.expensestracker.features.transaction.all.data.AllTransactionEnvironment
import com.example.expensestracker.features.transaction.all.data.IAllTransactionEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class AllTransactionModule {

    @Binds
    abstract fun provideEnvironment(
        environment: AllTransactionEnvironment
    ): IAllTransactionEnvironment

}
