package com.example.uno2.Actions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.example.uno2.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.item_add_packeges.view.*
import kotlinx.android.synthetic.main.item_add_packeges.view.imageViewHomePage
import kotlinx.android.synthetic.main.item_add_packeges.view.imageViewLastPage
import kotlinx.android.synthetic.main.item_add_packeges.view.imageViewPrint
import kotlinx.android.synthetic.main.stuff_add_packeges.view.*

class ActionButtonDialogFragmentStuffPackege: BottomSheetDialogFragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.stuff_add_packeges, container, false)
        val backPage = view.imageViewLastPage
        val imageViewHomePage = view.imageViewHomePage
        val imageViewPrint = view.imageViewPrint
        val LL_add_shop_stuff = view.LL_add_shop_stuff
        val LL_add_shop_stuff2 = view.LL_add_shop_stuff2
        val LL_add_shop_stuff3 = view.LL_add_shop_stuff3
        backPage.setOnClickListener{
            openButtomSheet1()
            dismiss()
        }

        val animationFadeIn = AnimationUtils.loadAnimation(view.context, R.anim.slid_up)
        backPage.startAnimation(animationFadeIn)
        imageViewHomePage.startAnimation(animationFadeIn)
        imageViewPrint.startAnimation(animationFadeIn)
        LL_add_shop_stuff.startAnimation(animationFadeIn)
        LL_add_shop_stuff2.startAnimation(animationFadeIn)
        LL_add_shop_stuff3.startAnimation(animationFadeIn)

        return view
    }


    fun openButtomSheet1(){
        val addItemBottomDialogFragment = ActionButton.newInstace1()
        addItemBottomDialogFragment.show(parentFragmentManager, ActionButton.TAG1)
    }
}