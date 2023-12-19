package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.DAO.SimpleProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class NorthwindApplication implements CommandLineRunner {
    @Autowired
    private SimpleProductDAO simpleProductDAO;

    @Override
    public void run(String... args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("0")) {
            System.out.println("""
                    1) List Products
                    2) Add Products
                    3) Exit
                    """);
            input = myScanner.nextLine();
            switch (input) {
                case "1":
                    simpleProductDAO.getAll();
                    break;
                case "2":
                    System.out.println("Enter product name:");
                    String productName = myScanner.nextLine();
                    Product newProduct = new Product(productName);
                    simpleProductDAO.add(newProduct);
                    break;
                case "3":
                    myScanner.close();
                    System.exit(0);
            }
        }

    }
}
