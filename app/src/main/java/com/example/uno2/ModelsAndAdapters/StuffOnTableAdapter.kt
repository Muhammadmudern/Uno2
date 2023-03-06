package com.example.uno2.ModelsAndAdapters


import android.media.Image
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

class StuffOnTableAdapter: RecyclerView.Adapter<StuffOnTableAdapter.StuffOnTableViewHolder>()  {
    private lateinit var valueCountPluse: String
    private lateinit var valueCountMinuse: String
    val SOTList = ArrayList<DataStuffOnTable>()

    class StuffOnTableViewHolder(StuffOnTableView: View): RecyclerView.ViewHolder(StuffOnTableView){
        val textViewNameStuff: TextView = StuffOnTableView.findViewById(R.id.TextViewStuffOnTableName)
        val textViewPriceStuff: TextView = StuffOnTableView.findViewById(R.id.TextViewStuffOnTablePrice)
        val textViewCountStuff: TextView = StuffOnTableView.findViewById(R.id.TextViewStuffOnTableCount)
        val imageViewPluseStuff: ImageView = StuffOnTableView.findViewById(R.id.imageViewPluseStuff)
        val imageViewMinuseStuff: ImageView = StuffOnTableView.findViewById(R.id.imageViewMinuseStuff)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StuffOnTableViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_to_show_ditail, parent, false)
        return StuffOnTableViewHolder(view)

    }

    override fun onBindViewHolder(holder: StuffOnTableViewHolder, position: Int) {
        val item = SOTList[position]
        holder.textViewNameStuff.text = item.nameStuff
        holder.textViewPriceStuff.text = item.priceStuff
        holder.textViewCountStuff.text = item.countStuff


        holder.imageViewPluseStuff.setOnClickListener {
            valueCountPluse = holder.textViewCountStuff.text.toString()
            valueCountPluse = (valueCountPluse.toInt()+ 1).toString()
            holder.textViewCountStuff.text = valueCountPluse
        }

        holder.imageViewMinuseStuff.setOnClickListener {
            valueCountMinuse = holder.textViewCountStuff.text.toString()
            valueCountMinuse = (valueCountMinuse.toInt()- 1).toString()
            if(valueCountMinuse.toInt() < 0){
                valueCountMinuse = "0"
            }
            holder.textViewCountStuff.text = valueCountMinuse

        }

    }

    override fun getItemCount(): Int {
        return SOTList.size
    }

    fun addStuffOnTable(stuffOnTable: DataStuffOnTable){
        SOTList.add(stuffOnTable)
        notifyItemInserted(SOTList.size - 1)
    }
}