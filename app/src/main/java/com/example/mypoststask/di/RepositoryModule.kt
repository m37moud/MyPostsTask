package com.example.mypoststask.di

import com.example.data.remote.PostsApi
import com.example.data.repository.PostsRepoImpl
import com.example.domain.repository.PostsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideRepo(apiService: PostsApi): PostsRepo{
        return PostsRepoImpl(apiService)
    }
}