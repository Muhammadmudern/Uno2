package com.example.uno2.Fragments


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.Domain.ShopItem
import com.example.uno2.ModelsAndAdapters.DataItemTable
import com.example.uno2.ModelsAndAdapters.ItemTableAdapter
import com.example.uno2.ModelsAndAdapters.Large_Main_Page_Model
import com.example.uno2.R
import com.example.uno2.ShopItemAddActivity

class Fragment3 : Fragment() {

    private lateinit var recyclerViewTable: RecyclerView
    private lateinit var itemList: ArrayList<DataItemTable>
    private lateinit var ItemTableAdapter: ItemTableAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_3, container, false)

        recyclerViewTable = view.findViewById(R.id.recyclerView03)
        recyclerViewTable.setHasFixedSize(true)
        recyclerViewTable.layoutManager = GridLayoutManager(this@Fragment3.context, 3)

        itemList = ArrayList()
        addDataList()

        ItemTableAdapter = ItemTableAdapter((itemList))
        recyclerViewTable.adapter = ItemTableAdapter

        ItemTableAdapter.onShopItemClickListener= {
            val intent = Intent(this@Fragment3.context, ShopItemAddActivity::class.java)
            startActivity(intent)
            activity?.finish()
            Log.d("MassageForCount3", it.toString())
        }

        return view
    }

    private fun addDataList() {
        var intCount: Int = 21
        for (i in 1 until intCount){
            itemList.add(DataItemTable(R.drawable.bakcground_for_table_dis, i.toString(), "Hello3"))
        }
    }
}