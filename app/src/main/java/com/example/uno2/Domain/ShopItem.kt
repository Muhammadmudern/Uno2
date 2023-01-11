package com.example.uno2.Domain


data class ShopItem (
    val client: String,
    val count: Int,
    val enabled: Boolean,
    var id: Int = UNDEFINED_ID
){
    companion object {
        const val UNDEFINED_ID = -1
    }

}