package com.example.domain.entity

//@Parcelize
data class PostsResultItem(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)
//    : Parcelable