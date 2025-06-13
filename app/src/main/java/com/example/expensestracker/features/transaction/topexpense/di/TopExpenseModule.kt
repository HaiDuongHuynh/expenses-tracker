package com.example.expensestracker.features.transaction.topexpense.di

import com.example.expensestracker.features.transaction.topexpense.data.ITopExpenseEnvironment
import com.example.expensestracker.features.transaction.topexpense.data.TopExpenseEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class TopExpenseModule {

    @Binds
    abstract fun provideEnvironment(
        environment: TopExpenseEnvironment
    ): ITopExpenseEnvironment

}
