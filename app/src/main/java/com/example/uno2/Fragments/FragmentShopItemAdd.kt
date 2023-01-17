package com.example.uno2.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.uno2.Actions.ActionButton
import com.example.uno2.Large_Main_Page
import com.example.uno2.databinding.FragmentShopItemAddBinding


class FragmentShopItemAdd : Fragment() {
    public var return_answer_for_close: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val bind = FragmentShopItemAddBinding.inflate(layoutInflater)
        bind.imageViewBack.setOnClickListener{
            val intent = Intent(this@FragmentShopItemAdd.requireContext(), Large_Main_Page::class.java)
            startActivity(intent)
        }

        bind.buttoncloseItem.setOnClickListener {
            val mAlertDialog = AlertDialog.Builder(this@FragmentShopItemAdd.requireContext())
            mAlertDialog.setTitle("Закрыть счет?")
            mAlertDialog.setMessage("Убедитесь что клиент оплатил счет!")
            mAlertDialog.setPositiveButton("Закрыть"){dialog,id ->
                Toast.makeText(this@FragmentShopItemAdd.requireContext(), "Счет закрыт", Toast.LENGTH_LONG).show()
                return_answer_for_close = true
                val intent = Intent(this@FragmentShopItemAdd.requireContext(), Large_Main_Page::class.java)
                startActivity(intent)
            }

            mAlertDialog.setNegativeButton("Отменить"){dialog, id ->
                dialog.dismiss()
            }
            mAlertDialog.show()
        }

        bind.addNewItem.setOnClickListener { openButtomSheet3() }


        return bind.root
    }

    fun openButtomSheet3(){
        val addItemBottomDialogFragment = ActionButton.newInstace3()
        addItemBottomDialogFragment.show(parentFragmentManager, ActionButton.TAG3)
    }

}