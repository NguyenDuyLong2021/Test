package com.homework.lab6.services;

import com.homework.lab6.beans.Product;
import com.homework.lab6.dao.ProductDao;

import java.util.*;

public class ProductService {
    private static ProductService productService = null;
     Map<String, Product> mapProduct = new HashMap<>();

    {
        mapProduct.put("sp1", new Product(1, "Giày Cung Đình", "http://localhost:8080/lab6/images/pic1.jpg", 600, 300));
        mapProduct.put("sp2", new Product(2, "Giày Nike", "http://localhost:8080/lab6/images/pic2.jpg", 1000, 930));
        mapProduct.put("sp3", new Product(3, "Giày Puma", "http://localhost:8080/lab6/images/pic3.jpg", 453, 242));
        mapProduct.put("sp4", new Product(4, "Giày Bitis", "http://localhost:8080/lab6/images/pic4.jpg", 999, 445));
        mapProduct.put("sp5", new Product(5, "Giày Adidas", "http://localhost:8080/lab6/images/pic5.jpg", 655, 555));
        mapProduct.put("sp6", new Product(6, "Giày Adidas Auth Loại 1", "http://localhost:8080/lab6/images/pic6.jpg", 600, 300));
        mapProduct.put("sp7", new Product(7, "Giày thể thao 11", "http://localhost:8080/lab6/images/pic7.jpg", 1000, 930));
        mapProduct.put("sp8", new Product(8, "Giày đá banh", "http://localhost:8080/lab6/images/pic8.jpg", 453, 242));
        mapProduct.put("sp9", new Product(9, "Giày múa ba lê", "http://localhost:8080/lab6/images/pic9.jpg", 999, 445));
        mapProduct.put("sp10", new Product(10, "Giày bảo hộ lao động", "http://localhost:8080/lab6/images/pic10.jpg", 655, 555));
        mapProduct.put("sp11", new Product(11, "Giày chống trượt", "http://localhost:8080/lab6/images/pic11.jpg", 600, 300));
        mapProduct.put("sp12", new Product(12, "Giày em bé loại 2", "http://localhost:8080/lab6/images/pic12.jpg", 1000, 930));
        mapProduct.put("sp13", new Product(13, "Giày Thái Lan", "http://localhost:8080/lab6/images/pic14.jpg", 453, 242));
        mapProduct.put("sp14", new Product(14, "Giày da cá sấu", "http://localhost:8080/lab6/images/pic14.jpg", 999, 445));
        mapProduct.put("sp15", new Product(15, "Giày quý phái dành cho nữ", "http://localhost:8080/lab6/images/pic15.jpg", 655, 555));
        mapProduct.put("sp16", new Product(16, "Giày độn chiều cao", "http://localhost:8080/lab6/images/pic16.jpg", 600, 300));
        mapProduct.put("sp17", new Product(17, "Giày lười cho nam", "http://localhost:8080/lab6/images/pic17.jpg", 1000, 930));
        mapProduct.put("sp18", new Product(18, "Giày leo núi", "http://localhost:8080/lab6/images/pic18.jpg", 453, 242));
        mapProduct.put("sp19", new Product(19, "Giày chạy bộ", "http://localhost:8080/lab6/images/pic19.jpg", 999, 445));
        mapProduct.put("sp20", new Product(20, "Giày siêu cấp vip pro", "http://localhost:8080/lab6/images/pic20.jpg", 655, 555));
        mapProduct.put("sp21", new Product(21, "Giày dành cho người cao tuổi", "http://localhost:8080/lab6/images/pic1.jpg", 185, 55));

    }

    public static ProductService getInstance() {
        if (productService == null) {
            return new ProductService();
        }
        return productService;
    }

    public static List<Product> getMapProduct() {
        List<Product> list=ProductDao.getIntance().getAll();
        for (Product p: list) {
            System.out.println(p);
        }
        return list;
    }

//    public static void main(String[] args) {
//        for (Product p: getInstance().getMapProduct()) {
//            System.out.println(p);
//        }
//    }

}
