package com.example.uno2.Actions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.example.uno2.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.add_main_dialog_page.view.*

class ActionBottomDialogFragmentMainPage: BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.add_main_dialog_page, container, false)
        val nextPage = view.buttonForAddDish

        nextPage.setOnClickListener {
            openButtomShee1()
            dismiss()
        }

        val animationFadeIn = AnimationUtils.loadAnimation(view.context, R.anim.slid_up)
        nextPage.startAnimation(animationFadeIn)

        return view
    }

    fun openButtomShee1(){
        val addItemBottomDialogFragment = ActionButton.newInstace1()
        addItemBottomDialogFragment.show(parentFragmentManager, ActionButton.TAG1)
    }
}