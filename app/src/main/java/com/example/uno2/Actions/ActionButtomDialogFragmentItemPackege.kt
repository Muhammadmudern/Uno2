package com.example.uno2.Actions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uno2.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.item_add_packeges.view.*

class ActionButtomDialogFragmentItemPackege: BottomSheetDialogFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.item_add_packeges, container, false)
        val nextPage = view.LL_add_shop_item
        val backPage = view.imageViewLastPage
        val homePage = view.imageViewHomePage

        backPage.setOnClickListener{
            openButtomSheet3()
        }

        nextPage.setOnClickListener {
            openButtomSheet2()
        }

        return view
    }

    fun openButtomSheet2(){
        val addItemBottomDialogFragment = ActionButton.newInstace2()
        addItemBottomDialogFragment.show(parentFragmentManager, ActionButton.TAG2)
    }

    fun openButtomSheet3(){
        val addItemBottomDialogFragment = ActionButton.newInstace3()
        addItemBottomDialogFragment.show(parentFragmentManager, ActionButton.TAG3)
    }
}