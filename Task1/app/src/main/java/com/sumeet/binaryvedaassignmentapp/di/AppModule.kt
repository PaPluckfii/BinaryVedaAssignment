package com.sumeet.binaryvedaassignmentapp.di

import com.sumeet.binaryvedaassignmentapp.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Module for dependency injection
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule{

    @Singleton
    @Provides
    fun provideMyRepository() : MyRepository = MyRepository()

}