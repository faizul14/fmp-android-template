package com.faezolmp.projek_android_template.core.di

import com.faezolmp.projek_android_template.core.data.ImplRepository
import com.faezolmp.projek_android_template.core.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module(includes = [ExampleModule::class, DatabaseModule::class, NetworkModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun provideRepository(repository: ImplRepository): Repository
}