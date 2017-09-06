package com.main.java.restaurant;

import java.util.Map;

public interface IMenu {

    Product add(Product order) ;

    void delete(int id) ;

    Product get(int id) ;

    Map<Integer, Product> getAll();

}
