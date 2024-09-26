package com.faezolmp.projek_android_template.presentation.di

import com.faezolmp.projek_android_template.core.domain.usecase.UseCase
import com.faezolmp.projek_android_template.core.domain.usecase.UseCaseIteractor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class AppModule {
    @Binds
    @ViewModelScoped
    abstract fun provideUseCase(useCase: UseCaseIteractor): UseCase
}