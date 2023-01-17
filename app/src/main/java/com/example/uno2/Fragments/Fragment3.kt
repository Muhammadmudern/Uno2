package com.example.uno2.Fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.uno2.Domain.ShopItem
import com.example.uno2.ModelsAndAdapters.Large_Main_Page_Model
import com.example.uno2.R
import com.example.uno2.ShopItemAddActivity

class Fragment3 : Fragment() {
    private lateinit var viewModel: Large_Main_Page_Model
    private lateinit var ll_shopList_ena: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
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
        ll_shopList_ena.removeAllViews()
        for(shopItem in list){
            val layoutId = if(shopItem.enabled){
                R.layout.disabled_item_shop
            }else{
                R.layout.enabled_item_shop
            }
            val view = LayoutInflater.from(this@Fragment3.context).inflate(layoutId, ll_shopList_ena,false)
            val tv_name1 = view.findViewById<TextView>(R.id.tv_name1)
            val tv_name2 = view.findViewById<TextView>(R.id.tv_name2)
            val tv_name3 = view.findViewById<TextView>(R.id.tv_name3)
            tv_name1.text = shopItem.count.toString()
            tv_name2.text = shopItem.count.toString()
            tv_name3.text = shopItem.count.toString()
            view.setOnClickListener {
                val intent = Intent(view.context, ShopItemAddActivity::class.java)
                startActivity(intent
                )
            }
            tv_name2.setOnLongClickListener {
                viewModel.changeEnableState(shopItem)
                true
            }
            ll_shopList_ena.addView(view)
        }
    }
}