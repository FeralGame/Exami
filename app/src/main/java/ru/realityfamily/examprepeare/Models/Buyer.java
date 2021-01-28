package ru.realityfamily.examprepeare.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Buyer {
    private int id;
    private int want_to_buy_products;
    private List<Product> cart;
    private double sum;
    private Store store;
    private String status;

    public Buyer(int id, int want_to_buy_products) {
        this.id = id;
        this.want_to_buy_products = want_to_buy_products;
        this.cart = new ArrayList<>();
        this.sum = 0.0;
    }

    public void EnterTheShop(Store new_store) {
        // ваш код здесь
    }

    private void AddProduct(int product_id) {
        // ваш код здесь
    }
}
