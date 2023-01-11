package com.example.uno2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.Domain.ShopItem

class ShopListAdapter: RecyclerView.Adapter<ShopListAdapter.ShopListViewHolder>() {
    val list = listOf<ShopItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.disabled_item_shop, parent, false)
        return ShopListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShopListViewHolder, position: Int) {
        val shopItem = list[position]
        holder.tvName1.text = shopItem.client
        holder.tvName2.text = shopItem.client
        holder.tvName3.text = shopItem.client
        holder.itemView.setOnClickListener {
            true
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ShopListViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tvName1 = view.findViewById<TextView>(R.id.tv_coun1)
        val tvName2 = view.findViewById<TextView>(R.id.tv_coun2)
        val tvName3 = view.findViewById<TextView>(R.id.tv_coun3)
    }
}