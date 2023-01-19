package com.example.uno2.Actions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
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
        val imageViewPrint = view.imageViewPrint
        val LL_add_shop_item2 = view.LL_add_shop_item2
        val LL_add_shop_item3 = view.LL_add_shop_item3

        backPage.setOnClickListener{
            dismiss()
        }

        nextPage.setOnClickListener {
            openButtomSheet2()
            dismiss()
        }

        val animationFadeIn = AnimationUtils.loadAnimation(view.context, R.anim.slid_up)
        nextPage.startAnimation(animationFadeIn)
        backPage.startAnimation(animationFadeIn)
        homePage.startAnimation(animationFadeIn)
        imageViewPrint.startAnimation(animationFadeIn)
        LL_add_shop_item2.startAnimation(animationFadeIn)
        LL_add_shop_item3.startAnimation(animationFadeIn)


        return view
    }

    fun openButtomSheet2(){
        val addItemBottomDialogFragment = ActionButton.newInstace2()
        addItemBottomDialogFragment.show(parentFragmentManager, ActionButton.TAG2)
    }
}