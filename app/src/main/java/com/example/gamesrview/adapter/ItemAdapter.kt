package com.example.gamesrview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gamesrview.data.model.Games
import com.example.gamesrview.databinding.GamesItemBinding

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Games>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: GamesItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = GamesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // der aktuelle Fan wird von der Liste geladen
        val item = dataset[position]

        holder.binding.gameCover.setImageResource(item.picResource)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}
