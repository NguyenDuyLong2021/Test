package com.homework.lab6.dao;

import com.homework.lab6.beans.Product;
import com.homework.lab6.db.JDBIConnector;

import javax.servlet.ServletException;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDao {
    private static ProductDao instance;

    private ProductDao() {
    }

    public static ProductDao getIntance() {
        if (instance == null) instance = new ProductDao();
        return instance;
    }

    public List<Product> getAll() {
       return JDBIConnector.get().withHandle(handle -> {
           return handle.createQuery("select * from product ").mapToBean(Product.class).list();
       });
//        System.out.println("nè");
//        System.out.println(productList);
    }
}
