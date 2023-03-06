package com.example.uno2.ModelsAndAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.R

class ItemAdapter(private val itemList: ArrayList<DataForItem>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()  {

    var onShopItemClickListener: ((DataForItem) -> Unit)? = null

    class ItemViewHolder(itemViewTable: View): RecyclerView.ViewHolder(itemViewTable){
        val buttonViewItem: Button = itemViewTable.findViewById(R.id.ButtonViewForItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_add_packeges_container, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.buttonViewItem.setBackgroundResource(item.ImageViewItem)
        holder.buttonViewItem.text = item.TextViewForItem


        holder.buttonViewItem.setOnClickListener {
            onShopItemClickListener?.invoke(item)
        }


    }

    override fun getItemCount(): Int {
        return itemList.size
    }


}