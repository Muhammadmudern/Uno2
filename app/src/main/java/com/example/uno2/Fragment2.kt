package com.example.uno2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.uno2.Domain.ShopItem

class Fragment2 : Fragment() {
    private lateinit var viewModel: MainViewModel
    private lateinit var shopListLinerLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this){
            showList(it)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    private fun showList(list: List<ShopItem>){
        shopListLinerLayout.removeAllViews()
        for(shopItem  in list) {
            val layoutId = if (shopItem.enabled) {
                R.layout.enabled_item_shop
            } else {
                R.layout.disabled_item_shop
            }
            val view = LayoutInflater.from(context).inflate(layoutId, shopListLinerLayout, false)
            val tvName1 = view.findViewById<TextView>(R.id.tv_coun1)
            val tvName2 = view.findViewById<TextView>(R.id.tv_coun2)
            val tvName3 = view.findViewById<TextView>(R.id.tv_coun3)
            tvName1.text = shopItem.client
            tvName2.text = shopItem.client
            tvName3.text = shopItem.client
            shopListLinerLayout.addView(view)
        }
    }

}