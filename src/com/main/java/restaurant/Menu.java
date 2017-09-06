package com.main.java.restaurant;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Menu implements IMenu{

    private static Connection connection;
    private static Menu menu;

    private Menu() {
    }

    public static IMenu getMenu(Connection connection) {
        if (menu == null) {
            Menu.connection = connection;
            menu = new Menu();
        }
        return menu;
    }

    @Override
    public Product get(int id) {
        try {
            String sql = "SELECT * FROM `menu` WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setPrice(rs.getDouble("price"));
            return product;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<Integer, Product> getAll() {
        Map<Integer, Product> products = new HashMap<>();
        try (Statement stmt = connection.createStatement()){
            String sql = "SELECT * FROM `menu` ORDER BY id";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble(("price")));
                products.put(product.getId(), product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product add(Product product) {
        String sql;
        PreparedStatement stmt;
        try {
                sql = "INSERT INTO `menu` (name, price) VALUES (?,?)";
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, String.valueOf(product.getName()));
                stmt.setString(2, String.valueOf(product.getPrice()));
                stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "DELETE FROM `menu` WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
