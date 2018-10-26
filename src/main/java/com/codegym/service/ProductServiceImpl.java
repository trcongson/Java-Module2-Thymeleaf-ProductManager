package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1, "FZ150",70,"150cc","Yamaha"));
        products.put(2,new Product(2, "CB150R",75,"149cc","Honda"));
        products.put(3,new Product(3, "BX150",66,"150cc","Brixton"));
        products.put(4,new Product(4, "W175",78,"175cc","Kawasaki"));
    }

    @Override
    public List<Product> findAll(){
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product){
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id){
        return products.get(id);
    }

    @Override
    public Product findByName(String name){
        return products.get(name);
    }

    @Override
    public void update(int id, Product product){
        products.put(id, product);
    }

    @Override
    public void remove(int id){
        products.remove(id);
    }
}