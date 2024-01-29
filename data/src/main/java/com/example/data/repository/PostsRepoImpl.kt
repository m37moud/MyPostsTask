package com.example.data.repository

import com.example.data.remote.PostsApi
import com.example.domain.entity.PostsResult
import com.example.domain.entity.PostsResultItem
import com.example.domain.repository.PostsRepo

class PostsRepoImpl(private val api: PostsApi) : PostsRepo {

    override fun getAllPosts(): PostsResult = api.getPosts()

    override fun getSinglePost(postId: Int): PostsResultItem = getSinglePost(postId)

}