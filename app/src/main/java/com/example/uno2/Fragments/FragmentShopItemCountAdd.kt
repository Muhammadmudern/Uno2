package com.example.uno2.Fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import android.media.ImageReader
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.Actions.ActionButton
import com.example.uno2.Actions.ActionButtonDialogFragmentStuffPackege
import com.example.uno2.Large_Main_Page
import com.example.uno2.ShopItemAddActivity
import com.example.uno2.Large_Main_Page.*
import com.example.uno2.ModelsAndAdapters.*
import com.example.uno2.R
import com.example.uno2.databinding.FragmentAddWithCountItemBinding
import kotlinx.android.synthetic.main.stuff_add_packeges.*
import java.util.*
import kotlin.collections.ArrayList


class FragmentShopItemCountAdd : Fragment(){

    private lateinit var recyclerViewStuffOnTable: RecyclerView
    private lateinit var stuffOnTableAdapter: StuffOnTableAdapter
    private lateinit var stuffOnTable: ArrayList<DataStuffOnTable>



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // adapter and data to add new stuff on recyclerView
        val view = inflater.inflate(R.layout.fragment_add_with_count_item, container, false)

        recyclerViewStuffOnTable = view.findViewById(R.id.recycle_view_for_add_count)
        recyclerViewStuffOnTable.setHasFixedSize(true)
        recyclerViewStuffOnTable.layoutManager = GridLayoutManager(this@FragmentShopItemCountAdd.context, 1)


        stuffOnTable = ArrayList()
        stuffOnTableAdapter = StuffOnTableAdapter()
        recyclerViewStuffOnTable.adapter = stuffOnTableAdapter

//        addDataList()

        view.findViewById<Button>(R.id.buttonTest).setOnClickListener {
            addDataList()
        }

        // this bind we use for click on ButtonSheet

        val buttonForAddDish: Button = view.findViewById(R.id.buttonForAddDish)
        buttonForAddDish.setOnClickListener {
            openButtomShee1()
        }

        val imageViewBackToCount: ImageView = view.findViewById(R.id.imageViewBackToCount)
        imageViewBackToCount.setOnClickListener {
            startActivity()
        }

        return view
    }

    private fun startActivity() {
        val intent = Intent(
            this@FragmentShopItemCountAdd.requireContext(),
            ShopItemAddActivity::class.java
        )
        startActivity(intent)
        activity?.finish()
    }

    fun openButtomShee1(){
        val addItemBottomDialogFragment = ActionButton.newInstace1()
        addItemBottomDialogFragment.show(parentFragmentManager, ActionButton.TAG1)
    }


    private fun addDataList() {
//        Toast.makeText(context, SOTList.toString(), Toast.LENGTH_SHORT).show()
            stuffOnTableAdapter.addStuffOnTable(
                DataStuffOnTable(
                    R.drawable.pluse,
                    R.drawable.minuse,
                    "Редбул",
                    "1800",
                    "1",)
            )
    }
}