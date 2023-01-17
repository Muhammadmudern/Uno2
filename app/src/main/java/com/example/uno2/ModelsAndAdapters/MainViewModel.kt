package com.example.uno2.ModelsAndAdapters

import androidx.lifecycle.ViewModel
import com.example.uno2.Data.ShopListRepositoryImpl
import com.example.uno2.Domain.DeleteShopItemUseCase
import com.example.uno2.Domain.EditShopItemUseCase
import com.example.uno2.Domain.GetShopListUseCase
import com.example.uno2.Domain.ShopItem

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl
    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)
    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}