package com.example.uno2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.fragment.findNavController
import com.example.uno2.Domain.ShopItem


class Fragment1 : Fragment() {
    private lateinit var viewModel: MainViewModel
    private lateinit var shopListLinerLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.shopList.observe(this){
            showList(it)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }


    private fun showList(list: List<ShopItem>){
        for(shopItem  in list){
            val layoutId = if(shopItem.enabled){
                R.layout.enabled_item_shop
            }else{
                R.layout.disabled_item_shop
            }
            val view = LayoutInflater.from(this).inflate(layoutId, )
        }
    }

}