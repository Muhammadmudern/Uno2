package com.example.uno2.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.uno2.R
import com.example.uno2.ShopItemAddActivity


class FragmentForAddTable : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_for_add_table, container, false)
        view.findViewById<TextView>(R.id.TextViewTableItem).setOnClickListener {
            val intent = Intent(this@FragmentForAddTable.requireContext(), ShopItemAddActivity::class.java)
            startActivity(intent)
        }


        return view
    }

}