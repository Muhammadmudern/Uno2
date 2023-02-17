package com.example.uno2.ModelsAndAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.R

class StuffAdapter(private val itemList: ArrayList<DataForStuff>): RecyclerView.Adapter<StuffAdapter.StuffViewHolder>()  {

    var onShopStuffClickListener: ((DataForStuff) -> Unit)? = null

    class StuffViewHolder(stuffViewTable: View): RecyclerView.ViewHolder(stuffViewTable){
        val imageViewStuff: ImageView = stuffViewTable.findViewById(R.id.ImageViewForStuff)
        val textViewStuff: TextView = stuffViewTable.findViewById(R.id.TextViewForStuff)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StuffViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.stuff_add_packages_container, parent, false)
        return StuffViewHolder(view)

    }

    override fun onBindViewHolder(holder: StuffViewHolder, position: Int) {
        val item = itemList[position]
        holder.imageViewStuff.setImageResource(item.ImageViewStuff)
        holder.textViewStuff.text = item.TextViewForStuff

        holder.imageViewStuff.setOnClickListener {
              onShopStuffClickListener
        }


    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}