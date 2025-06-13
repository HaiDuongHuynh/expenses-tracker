package com.example.expensestracker.features.onboarding.di

import com.example.expensestracker.features.onboarding.data.IOnboardingEnvironment
import com.example.expensestracker.features.onboarding.data.OnboardingEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class OnboardingModule {

    @Binds
    abstract fun provideEnvironment(
        environment: OnboardingEnvironment
    ): IOnboardingEnvironment

}
