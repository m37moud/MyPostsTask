package com.example.domain.usecase

import com.example.domain.repository.PostsRepo

class PostUseCase(private val postsRepo: PostsRepo) {
    suspend fun getAllPosts() = postsRepo.getAllPosts()
    suspend fun getSinglePost(postId:Int) = postsRepo.getSinglePost(postId)
}