package com.example.uno2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ShopItemCountAdd : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_item_count_add)
        HideActionBar()
    }

    private fun HideActionBar() {
        supportActionBar?.hide()
    }
}