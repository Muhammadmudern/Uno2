package com.example.uno2.ModelsAndAdapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.R

class ItemTableAdapter(private val itemList: ArrayList<DataItemTable>): RecyclerView.Adapter<ItemTableAdapter.ItemTableViewHolder>()  {

    var onShopItemClickListener: ((DataItemTable) -> Unit)? = null

    class ItemTableViewHolder(itemViewTable: View): RecyclerView.ViewHolder(itemViewTable){
        val imageViewTable: ImageView = itemViewTable.findViewById(R.id.ImageViewForTable)
        val textViewCountTable: TextView = itemViewTable.findViewById(R.id.TextViewTableCount)
        val textViewTableItem: TextView = itemViewTable.findViewById(R.id.TextViewTableItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemTableViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_for_add_table, parent, false)
        return ItemTableViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemTableViewHolder, position: Int) {
        val item = itemList[position]
        holder.imageViewTable.setImageResource(item.ImageViewForTable)
        holder.textViewCountTable.text = item.TextViewCountForTable
        holder.textViewTableItem.text = item.TextViewForItemTable

        holder.imageViewTable.setOnClickListener {
            onShopItemClickListener?.invoke(item)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


}