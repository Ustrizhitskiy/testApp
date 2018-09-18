package com.shop.services.impl;

import com.shop.DAO.BuyerDAO;
import com.shop.DAO.ShopDAO;
import com.shop.models.Buyer;
import com.shop.models.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shop.services.ShopService;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    ShopDAO shopDAO;

    @Autowired
    BuyerDAO buyerDAO;

        @Override
        public void saveShop(Shop shop) {
            shopDAO.saveShop(shop);
        }

        @Override
        public void delete(Shop shop) {
        }

        @Override
        public void update(Shop shop) {
        }

        @Override
        public List<Shop> findAll() {
            return null;
        }

        @Override
        public Buyer findBuyerById(int id) {
            return null;
        }

        @Override
        public Shop getShopById(int id) {
            return null;
        }
}
