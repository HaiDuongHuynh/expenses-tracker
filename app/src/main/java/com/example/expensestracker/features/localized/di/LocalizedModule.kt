package com.example.expensestracker.features.localized.di

import com.example.expensestracker.features.localized.data.ILocalizedEnvironment
import com.example.expensestracker.features.localized.data.LocalizedEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class LocalizedModule {

    @Binds
    abstract fun provideEnvironment(
        environment: LocalizedEnvironment
    ): ILocalizedEnvironment

}
