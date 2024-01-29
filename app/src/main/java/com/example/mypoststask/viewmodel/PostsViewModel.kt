package com.example.mypoststask.viewmodel

import android.util.Log
import com.example.domain.entity.PostsResult
import com.example.domain.usecase.PostUseCase
import javax.inject.Inject
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class PostsViewModel @Inject constructor(
    private val postUseCase: PostUseCase
): ViewModel()  {
    private val _posts: MutableStateFlow<PostsResult?> = MutableStateFlow(null)
    val posts: StateFlow<PostsResult?> = _posts

    fun getMeals(){
        viewModelScope.launch{
            try {
                _posts.value = postUseCase.getAllPosts()
            } catch (e: Exception){
                Log.e("PostsViewModel", e.message.toString())
            }
        }
    }

}