package com.example.domain.repository

import com.example.domain.entity.PostsResult
import com.example.domain.entity.PostsResultItem

interface PostsRepo {
    fun getAllPosts(): PostsResult
    fun getSinglePost(postId:Int): PostsResultItem
}