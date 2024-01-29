package com.example.mypoststask.di

import com.example.domain.repository.PostsRepo
import com.example.domain.usecase.PostUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

//
@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(postsRepo: PostsRepo): PostUseCase{
        return PostUseCase(postsRepo)
    }
}