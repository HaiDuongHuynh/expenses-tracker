package com.example.expensestracker.features.account.detail.di

import com.example.expensestracker.features.account.detail.data.AccountDetailEnvironment
import com.example.expensestracker.features.account.detail.data.IAccountDetailEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
abstract class AccountDetailModule {

    @Binds
    abstract fun provideEnvironment(
        environment: AccountDetailEnvironment
    ): IAccountDetailEnvironment

}
