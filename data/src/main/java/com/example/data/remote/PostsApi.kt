package com.example.data.remote

import com.example.domain.entity.PostsResult
import com.example.domain.entity.PostsResultItem
import retrofit2.http.GET
import retrofit2.http.Path

interface PostsApi {
    @GET("posts")
    fun getPosts(): PostsResult
    @GET("posts/{id}")
    fun getSinglePost(@Path("id") id:Int): PostsResultItem
}