package com.example.listsmusictab

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listsmusictab.databinding.FragmentTab2Binding


class TabFragment2 : Fragment() {
    private var _binding: FragmentTab2Binding? = null
    private val binding
        get() = requireNotNull(_binding) {
            "null"
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentTab2Binding.inflate(inflater, container, false)
            .also {
                _binding = it
            }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val music1: Music = Music("Clear mind", "Instrumental", R.drawable.pic1)
        val music2: Music = Music("Urban mood", "Hip-Hop", R.drawable.pic2)
        val music3: Music = Music("Party", "Pop", R.drawable.pic3)
        val music4: Music = Music("Jogging", "Techno", R.drawable.pic4)
        val musics = listOf<Music>(music1, music2, music3, music4)

        binding.run {

            recyclerView.layoutManager = LinearLayoutManager(
                view.context, LinearLayoutManager.HORIZONTAL, false
            )

            Log.d("зашли", "message")
            recyclerView.adapter = NotesAdapter1(musics) {

            }


        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}



