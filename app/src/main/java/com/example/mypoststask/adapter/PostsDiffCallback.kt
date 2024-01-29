package com.example.mypoststask.adapter

import com.example.domain.entity.PostsResultItem
import androidx.recyclerview.widget.DiffUtil

class PostsDiffCallback : DiffUtil.ItemCallback<PostsResultItem>() {
    override fun areItemsTheSame(
        oldItem: PostsResultItem,
        newItem: PostsResultItem
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: PostsResultItem,
        newItem: PostsResultItem
    ): Boolean {
        return oldItem == newItem
    }
}
