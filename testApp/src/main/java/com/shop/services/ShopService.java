package com.shop.services;

import com.shop.models.Buyer;
import com.shop.models.Shop;

import java.util.List;

public interface ShopService {

    void saveShop(Shop shop);

    public Shop getShopById(int id);

    void delete(Shop shop);

    void update(Shop shop);

    public List<Shop> findAll();

    public Buyer findBuyerById(int id);
}
