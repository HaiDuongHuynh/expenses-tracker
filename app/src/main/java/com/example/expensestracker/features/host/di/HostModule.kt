package com.example.expensestracker.features.host.di

import com.example.expensestracker.features.host.data.HostEnvironment
import com.example.expensestracker.features.host.data.IHostEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class HostModule {

    @Binds
    abstract fun provideEnvironment(
        environment: HostEnvironment
    ): IHostEnvironment

}
