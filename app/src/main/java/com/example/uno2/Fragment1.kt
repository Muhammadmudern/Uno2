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

class Fragment1 : Fragment(){
    private lateinit var viewModel: Large_Main_Page_Model
    private lateinit var ll_shopList_ena: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        ll_shopList_ena = view.findViewById(R.id.ll_shopList_ena)
        viewModel = ViewModelProvider(this)[Large_Main_Page_Model::class.java]
        viewModel.shopList.observe(viewLifecycleOwner){
            showList(it)
        }
        return view
    }

    private fun showList(list: List<ShopItem>){
        for(shopItem in list){
            val layoutId = if(shopItem.enabled){
                R.layout.enabled_item_shop
            }else{
                R.layout.disabled_item_shop
            }
            val view = LayoutInflater.from(this@Fragment1.context).inflate(layoutId, ll_shopList_ena,false)
            ll_shopList_ena.addView(view)
        }
    }

}