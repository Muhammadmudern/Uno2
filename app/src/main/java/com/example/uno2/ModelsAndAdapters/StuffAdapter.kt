package com.example.uno2.ModelsAndAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.R

class StuffAdapter(private val itemList: ArrayList<DataForStuff>): RecyclerView.Adapter<StuffAdapter.StuffViewHolder>()  {

    var onShopStuffClickListener: ((DataForStuff) -> Unit)? = null

    class StuffViewHolder(stuffViewTable: View): RecyclerView.ViewHolder(stuffViewTable){
        val buttonViewItem: Button = stuffViewTable.findViewById(R.id.ButtonViewForStuff)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StuffViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.stuff_add_packages_container, parent, false)
        return StuffViewHolder(view)

    }

    override fun onBindViewHolder(holder: StuffViewHolder, position: Int) {
        val item = itemList[position]
        holder.buttonViewItem.setBackgroundResource(item.ImageViewStuff)
        holder.buttonViewItem.text = item.TextViewForStuff

        holder.buttonViewItem.setOnClickListener {
              onShopStuffClickListener
        }


    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}