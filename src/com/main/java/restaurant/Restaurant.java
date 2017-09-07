package com.main.java.restaurant;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

public class Restaurant {

    public static void main(String[] args) {
        try (Connection connection = Database.getConnection()){
            IMenu menu = Menu.getMenu(connection);
            Map<Integer, Product> productMap = menu.getAll();
            System.out.println("My pure menu: " + productMap);
            System.out.println("The first element is: "+menu.get(1));
            System.out.println("How to be without shrimps:( I want to see it in menu!");
            Product shrimp = new Product("shrimp", 27.7);
            menu.add(shrimp);
            System.out.println("Still pure menu: " + menu.getAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
