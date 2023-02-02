package com.example.uno2.ModelsAndAdapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.R
import kotlin.coroutines.coroutineContext

class ItemAdapter(private val itemList: ArrayList<DataForItem>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()  {

    var onShopItemClickListener: ((DataForItem) -> Unit)? = null

    class ItemViewHolder(itemViewTable: View): RecyclerView.ViewHolder(itemViewTable){
        val imageViewItem: ImageView = itemViewTable.findViewById(R.id.ImageViewForItem)
        val textViewItem: TextView = itemViewTable.findViewById(R.id.TextViewForItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_add_packeges_container, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.imageViewItem.setImageResource(item.ImageViewItem)
        holder.textViewItem.text = item.TextViewForItem

        holder.imageViewItem.setOnClickListener {
            onShopItemClickListener?.invoke(item)
        }


    }

    override fun getItemCount(): Int {
        return itemList.size
    }


}