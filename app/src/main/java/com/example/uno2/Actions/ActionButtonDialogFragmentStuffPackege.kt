package com.example.uno2.Actions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.ModelsAndAdapters.DataForItem
import com.example.uno2.ModelsAndAdapters.DataForStuff
import com.example.uno2.ModelsAndAdapters.DataStuffOnTable
import com.example.uno2.ModelsAndAdapters.StuffAdapter
import com.example.uno2.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.item_add_packeges.view.imageViewHomePage
import kotlinx.android.synthetic.main.item_add_packeges.view.imageViewLastPage
import kotlinx.android.synthetic.main.item_add_packeges.view.imageViewPrint

class ActionButtonDialogFragmentStuffPackege: BottomSheetDialogFragment(){

    private lateinit var recyclerViewStuff: RecyclerView
    private lateinit var itemList: ArrayList<DataForStuff>
    private lateinit var stuffAdapter: StuffAdapter


    private val list = listOf<String>("Кола", "Редбул", "Фанта","Спрайт","Пепси","Асу",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",
        "БАР", "Алко", "Напитки","На Второе","Стейки","Салаты",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.stuff_add_packeges, container, false)

        recyclerViewStuff = view.findViewById(R.id.recyclerViewStuff)
        recyclerViewStuff.setHasFixedSize(true)
        recyclerViewStuff.layoutManager = GridLayoutManager(this@ActionButtonDialogFragmentStuffPackege.context, 3)


        val backPage = view.imageViewLastPage
        val imageViewHomePage = view.imageViewHomePage
        val imageViewPrint = view.imageViewPrint

        itemList = ArrayList()
        addDataList()

        stuffAdapter = StuffAdapter((itemList))
        recyclerViewStuff.adapter = stuffAdapter





        backPage.setOnClickListener{
            openButtomSheet1()
            dismiss()
        }

        val animationFadeIn = AnimationUtils.loadAnimation(view.context, R.anim.slid_up)
        backPage.startAnimation(animationFadeIn)
        imageViewHomePage.startAnimation(animationFadeIn)
        imageViewPrint.startAnimation(animationFadeIn)

        return view
    }


    fun openButtomSheet1(){
        val addItemBottomDialogFragment = ActionButton.newInstace1()
        addItemBottomDialogFragment.show(parentFragmentManager, ActionButton.TAG1)
    }

    private fun addDataList() {
        for (i in 1 until 21){
            itemList.add(DataForStuff(R.drawable.package_for_stuff, list[i]))
        }
    }
}