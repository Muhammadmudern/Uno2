package com.example.uno2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uno2.databinding.ActivityShopItemAddBinding
import java.util.ArrayList

class ShopItemAddActivity : AppCompatActivity() {
    var Lorem_Text: RecyclerView? = null
    var adapter: PaymentAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_item_add)
        HideActionBar()



        Lorem_Text =findViewById(R.id.recycle_view)
    }

    private fun setRecycleView() {
        Lorem_Text!!.setHasFixedSize(true)
        Lorem_Text!!.layoutManager = LinearLayoutManager(this)
        adapter = PaymentAdapter(this, list)
        Lorem_Text!!.adapter = adapter
    }


    private val list: MutableList<PaymentModel>
        get() {
            val payment_list: MutableList<PaymentModel> = ArrayList()
            payment_list.add(PaymentModel("qweqweq1", "10000", 5))
            payment_list.add(PaymentModel("qweqweq2", "10000", 5))
            payment_list.add(PaymentModel("qweqweq3", "10000", 5))
            payment_list.add(PaymentModel("qweqweq4", "10000", 5))
            payment_list.add(PaymentModel("qweqweq5", "10000", 5))
            payment_list.add(PaymentModel("qweqweq6", "10000", 5))
            payment_list.add(PaymentModel("qweqweq7", "10000", 5))
            return payment_list
        }

    private fun HideActionBar() {
        supportActionBar?.hide()
    }
}