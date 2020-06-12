package org.example.cloud.product.service;

import org.example.cloud.product.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaqi
 * @version 1.0
 * @date 2020/6/12 15:00
 */
@Service
public class ProductService {
    @Value("${server.port}")
    String port;
    public List<Product> listProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"product a "+port));
        productList.add(new Product(2,"product b "+port ));
        productList.add(new Product(3,"product c :"+port));
        return productList;
    }

}
