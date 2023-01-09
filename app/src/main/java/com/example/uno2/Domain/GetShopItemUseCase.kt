package com.example.uno2.Domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(shopItemID: Int):ShopItem{
        return shopListRepository.getShopItem(shopItemID)
    }
}