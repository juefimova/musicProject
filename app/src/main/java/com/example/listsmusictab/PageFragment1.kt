package com.example.listsmusictab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listsmusictab.databinding.FragementPage1Binding


class PageFragment1(var position: Int): Fragment() {

    private var _binding: FragementPage1Binding? = null
    private val binding
    get() = requireNotNull(_binding) {
        "null"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragementPage1Binding.inflate(inflater, container, false).also {
            _binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



            val song1: Song = Song("Mon Amour", "Annalisa", R.drawable.image1)
            val song2: Song = Song("Starboy", "The Weekend", R.drawable.image2)
            val song3: Song = Song("505", "Arctic Monkeys", R.drawable.image3)
            val song4: Song = Song("eren", "Jann", R.drawable.image4)
            val song5: Song = Song("Atlantis", "Seafret", R.drawable.image5)
            val song6: Song = Song("Not Me", "Peach Pit", R.drawable.image6)
            val song7: Song = Song("Mad Visions", "Royal Blood", R.drawable.image7)
            val song8: Song = Song("Tattoo", "Loreen", R.drawable.image8)
            val song9: Song = Song("Smile", "Jann", R.drawable.image9)
            val song10: Song = Song("Kids", "MGMT", R.drawable.image10)
            val song11: Song = Song("Party", "Daughter", R.drawable.image11)
            val song12: Song = Song("Memories", "Conan Gray", R.drawable.image12)



            val recommendation = listOf<Song>(
                song1,
                song2,
                song3,
                song4,
                song5,
                song6,
                song7,
            )

        val popular = listOf<Song>(
            song8,
            song9,
            song10,
            song11,
            song12,
            song4,
            song5,
            song6,
            song7,
        )

        val new = listOf<Song>(
            song12,
            song9,
            song10,
            song5,
            song6,
            song3,
            song4,
            song8,
            song1,
            song2,
            song7,

        )

        val songs = listOf(recommendation, popular, new)

        binding.run{

            recyclerView2.layoutManager = LinearLayoutManager(
                view.context, LinearLayoutManager.VERTICAL, false)


                recyclerView2.adapter = NotesAdapter2(songs[position]) {

                }


        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}