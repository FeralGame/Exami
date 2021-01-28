package ru.realityfamily.examprepeare.Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    private int id;
    private Map<Product, Integer> products;


    public Store(int id, List<Product> new_products) {
        this.id = id;
        products = new HashMap<>();

        for (Product p : new_products) {
            AddProduct(p);
        }
    }

    public boolean CheckProduct(int id) {
        // ваш код здесь

        return true;
    }

    public Product GetProduct(int id) {
        // ваш код здесь

        return null;
    }

    private void AddProduct(Product product) {
        // ваш код здесь
    }

    public List<Product> GetProducts() {
        // ваш код здесь

        return null;
    }

    public int getId() {
        return id;
    }
}
