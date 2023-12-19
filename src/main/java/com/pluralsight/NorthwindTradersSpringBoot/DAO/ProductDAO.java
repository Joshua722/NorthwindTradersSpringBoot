package com.pluralsight.NorthwindTradersSpringBoot.DAO;

import com.pluralsight.NorthwindTradersSpringBoot.Model.Product;

import java.util.List;

public interface ProductDAO {
    public void add(Product product);
    public List<Product> getAll();
}
