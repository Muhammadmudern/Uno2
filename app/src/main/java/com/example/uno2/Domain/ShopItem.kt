package com.example.uno2.Domain


data class ShopItem (
    val client: String,
    val count: Int,
    val enabled: Boolean,
    var id: Int = UNDEFIND_ID
){
    companion object {
        const val UNDEFIND_ID = -1
    }

}