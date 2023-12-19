package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.Model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDAO implements ProductDAO{
private List<Product> products = new ArrayList<>();

    public SimpleProductDAO(List<Product> products) {
        this.products = products;
    }


    @Override
    public void add(Product product) {
    products.add(product);
    }

    @Override
    public List<Product> getAll() {
        for(Product p : products){
            System.out.println(p.toString());
        }
    return new ArrayList<>(products);
    }
}
