package com.main.java.restaurant;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

public class Restaurant {

    public static void main(String[] args) {
        try (Connection connection = Database.getConnection()){
            IMenu menu = Menu.getMenu(connection);
            Map<Integer, Product> productMap = menu.getAll();
            System.out.println(productMap);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
