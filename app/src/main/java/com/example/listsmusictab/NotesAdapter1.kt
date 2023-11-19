package com.example.listsmusictab

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listsmusictab.databinding.ItemNote1Binding


class NotesAdapter1(
    private val items: List<Music>,
    private val itemClick: (Music) -> Unit
) : RecyclerView.Adapter<NotesViewHolder1>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder1 {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NotesViewHolder1(
            binding = ItemNote1Binding.inflate(layoutInflater, parent, false),
            itemClick
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: NotesViewHolder1, position: Int) {
        holder.bind(items[position])
    }

}

class NotesViewHolder1(
    private val binding: ItemNote1Binding,
    private val itemClick: (Music) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Music) {
        binding.run {
            Log.d("зашли", "сообщение")
            song.text = item.name
            genre.text = item.genre
            image.setImageResource(item.pic_path)
            root.setOnClickListener {
                itemClick(item)
            }


        }

    }
}