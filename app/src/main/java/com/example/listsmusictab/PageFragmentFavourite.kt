package com.example.listsmusictab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.listsmusictab.databinding.FragmentFavouriteBinding



class PageFragmentFavourite: Fragment() {

    private var _binding: FragmentFavouriteBinding? = null
    private val binding
        get() = requireNotNull(_binding) {
            "null"
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentFavouriteBinding.inflate(inflater, container, false).also {
            _binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.run{

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}