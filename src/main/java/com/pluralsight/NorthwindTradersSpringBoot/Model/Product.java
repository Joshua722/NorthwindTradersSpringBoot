package com.pluralsight.NorthwindTradersSpringBoot.Model;

public class Product {
    int productID;
    String name;
    String category;
    double price;

    public Product(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Product " + name ;
    }
}
