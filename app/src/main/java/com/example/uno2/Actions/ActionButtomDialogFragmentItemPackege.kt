package com.example.uno2.Actions

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.ModelsAndAdapters.*
import com.example.uno2.R
import com.example.uno2.ShopItemAddActivity
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.item_add_packeges.view.*

class ActionButtomDialogFragmentItemPackege: BottomSheetDialogFragment(){

    private lateinit var recyclerViewItem: RecyclerView
    private lateinit var itemList: ArrayList<DataForItem>
    private lateinit var ItemAdapter: ItemAdapter


    private val list = listOf<String>("БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",)

    private val listForAlco = listOf<String>("Хенеси", "Vodka", "Вино", "Коньяк", "Скотч",
        "Хенеси", "Vodka", "Вино", "Коньяк", "Скотч",
        "Хенеси", "Vodka", "Вино", "Коньяк", "Скотч",
        "Хенеси", "Vodka", "Вино", "Коньяк", "Скотч",
        "Хенеси", "Vodka", "Вино", "Коньяк", "Скотч",
        "Хенеси", "Vodka", "Вино", "Коньяк", "Скотч",
        "Хенеси", "Vodka", "Вино", "Коньяк", "Скотч",
        "Хенеси", "Vodka", "Вино", "Коньяк", "Скотч",
        "Хенеси", "Vodka", "Вино", "Коньяк", "Скотч",)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.item_add_packeges, container, false)

        recyclerViewItem = view.findViewById(R.id.recyclerViewItem)
        recyclerViewItem.setHasFixedSize(true)
        recyclerViewItem.layoutManager = GridLayoutManager(this@ActionButtomDialogFragmentItemPackege.context, 3)


        val backPage = view.imageViewLastPage
        val homePage = view.imageViewHomePage
        val imageViewPrint = view.imageViewPrint
        val LL_add_shop_item2 = view.recyclerViewItem


        itemList = ArrayList()
        addDataList()

        ItemAdapter = ItemAdapter((itemList))
        recyclerViewItem.adapter = ItemAdapter


        ItemAdapter.onShopItemClickListener= {
            openButtomSheet2()
            dismiss()
        }

        backPage.setOnClickListener{
            dismiss()
        }


        val animationFadeIn = AnimationUtils.loadAnimation(view.context, R.anim.slid_up)
        backPage.startAnimation(animationFadeIn)
        homePage.startAnimation(animationFadeIn)
        imageViewPrint.startAnimation(animationFadeIn)
        LL_add_shop_item2.startAnimation(animationFadeIn)


        return view
    }

    fun openButtomSheet2(){
        val addItemBottomDialogFragment = ActionButton.newInstace2()
        addItemBottomDialogFragment.show(parentFragmentManager, ActionButton.TAG2)
    }

    private fun addDataList() {
        for (i in 1 until 21){
            itemList.add(DataForItem(R.drawable.package_for_item, list[i]))
//            if (list[i].toString() == "Алко"){
//                itemToStuff.add(listForAlco)
//            }
        }
    }
}