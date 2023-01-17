package com.example.uno2.Actions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uno2.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.item_add_packeges.view.*

class ActionButtonDialogFragmentStuffPackege: BottomSheetDialogFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.stuff_add_packeges, container, false)
        val backPage = view.imageViewLastPage

        backPage.setOnClickListener{openButtomSheet1()}


        return view
    }


    fun openButtomSheet1(){
        val addItemBottomDialogFragment = ActionButton.newInstace1()
        addItemBottomDialogFragment.show(parentFragmentManager, ActionButton.TAG1)
    }
}