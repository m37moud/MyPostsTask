package com.example.mypoststask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.mypoststask.databinding.FragmentSecondBinding
import com.example.mypoststask.viewmodel.PostsViewModel
import kotlinx.coroutines.launch

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    val viewModel : PostsViewModel by viewModels()
//    private val args by navArgs<SecondFragmentArgs>()
//val resultBundle = Bundle()
//    resultBundle.putParcelable("postBundle", args.result)

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        viewModel.getSinglePosts(resultBundleId)
        lifecycleScope.launch {
            val post = viewModel.singlePost

        _binding.titlePostTv.text = post.value?.title
        _binding.title_desc_tv.text = post.value?.title
        }

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.buttonSecond.setOnClickListener {
//            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}