package com.example.listsmusictab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.listsmusictab.databinding.FragmentTabBinding
import com.google.android.material.tabs.TabLayoutMediator

class ListFragment : Fragment() {
    private var _binding: FragmentTabBinding? = null
    private val binding
        get() = requireNotNull(_binding) {
            "null"
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentTabBinding.inflate(inflater, container, false)
            .also {
                _binding = it
            }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.run {

            val titles = listOf<String>("RECOMENDATION", "POPULAR", "NEW MUSIC")


            viewPager.adapter = FragmentTabAdapter(this@ListFragment)

            TabLayoutMediator(tabLayout, viewPager) {
                    tab, position ->
                tab.text = titles[position]
            }.attach()




            /*recyclerView1.layoutManager = LinearLayoutManager(view.context)

            val music1: Music = Music("Clear mind", "Instrumental", R.drawable.pic1)
            val music2: Music = Music("Urban mood", "Hip-Hop", R.drawable.pic2)
            val music3: Music = Music("Party", "Pop", R.drawable.pic3)
            val music4: Music = Music("Jogging", "Techno", R.drawable.pic4)
            val musics = listOf<Music>(music1, music2, music3, music4)


            val song1: Song = Song("Mon Amour", "Annalisa", R.drawable.image1)
            val song2: Song = Song("Starboy", "The Weekend", R.drawable.image2)
            val song3: Song = Song("505", "Arctic Monkeys", R.drawable.image3)
            val song4: Song = Song("eren", "Jann", R.drawable.image4)
            val song5: Song = Song("Atlantis", "Seafret", R.drawable.image5)
            val song6: Song = Song("Not Me", "Peach Pit", R.drawable.image6)
            val song7: Song = Song("Mad Visions", "Royal Blood", R.drawable.image7)
            val song8: Song = Song("Tattoo", "Loreen", R.drawable.image8)
            val song9: Song = Song("Tattoo", "Loreen", R.drawable.image9)
            val song10: Song = Song("Kids", "MGMT", R.drawable.image10)
            val song11: Song = Song("Party", "Daughter", R.drawable.image11)
            val song12: Song = Song("Memories", "Conan Gray", R.drawable.image12)

            val songs = listOf<Song>(song1, song2, song3, song4, song5, song6, song7, song8, song9, song10, song11, song12)


            recyclerView1.adapter = NotesAdapter1(musics) {


                 findNavController().navigate(
                     TabFragmentDirections.toClick(it)
                 )

            }*/

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


class FragmentTabAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> PageFragment1(position)
            1 -> PageFragment1(position)
            2 -> PageFragment1(position)
            else -> throw java.lang.IndexOutOfBoundsException("Wrong position $position")
        }
    }
}