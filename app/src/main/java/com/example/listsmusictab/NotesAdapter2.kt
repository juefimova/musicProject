package com.example.listsmusictab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listsmusictab.databinding.ItemNote2Binding


class NotesAdapter2(
    private val items: List<Song>,
    private val itemClick: (Song) -> Unit
) : RecyclerView.Adapter<NotesViewHolder2>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder2 {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NotesViewHolder2(
            binding = ItemNote2Binding.inflate(layoutInflater, parent, false),
            itemClick
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: NotesViewHolder2, position: Int) {
        holder.bind(items[position])
    }

}

class NotesViewHolder2(
    private val binding: ItemNote2Binding,
    private val itemClick: (Song) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Song) {
        binding.run {


            song.text = item.name
            singer.text = item.singer
            image.setImageResource(item.pic_path)
            root.setOnClickListener {
                itemClick(item)
            }


        }

    }
}