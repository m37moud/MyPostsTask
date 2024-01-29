package com.example.mypoststask.adapter

import android.view.LayoutInflater
import com.example.domain.entity.PostsResultItem
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.example.mypoststask.databinding.PostItemBinding


class PostsAdapter : ListAdapter<PostsResultItem, PostsAdapter.ViewHolder>(PostsDiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding =
            PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(private val itemBinding: PostItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(post: PostsResultItem) {
            itemBinding.postTitle.text = post.title
            itemBinding.postDesc.text = post.body

        }
    }
}