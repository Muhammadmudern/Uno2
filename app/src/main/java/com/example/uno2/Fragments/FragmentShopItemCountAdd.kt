package com.example.uno2.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.uno2.Actions.ActionButton
import com.example.uno2.Large_Main_Page
import com.example.uno2.ShopItemAddActivity
import com.example.uno2.databinding.FragmentAddWithCountItemBinding
import com.example.uno2.Large_Main_Page.*
import java.util.*


class FragmentShopItemCountAdd() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val bind = FragmentAddWithCountItemBinding.inflate(layoutInflater)

        bind.buttonForAddDish.setOnClickListener {
            openButtomShee1()

        }

        bind.imageViewBackToCount.setOnClickListener {
            startActivity()
        }

        return bind.root
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
}