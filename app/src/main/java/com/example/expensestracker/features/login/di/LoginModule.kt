package com.example.expensestracker.features.login.di

import com.example.expensestracker.features.login.data.ILoginEnvironment
import com.example.expensestracker.features.login.data.LoginEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class LoginModule {

    @Binds
    abstract fun provideEnvironment(
        environment: LoginEnvironment
    ): ILoginEnvironment

}
