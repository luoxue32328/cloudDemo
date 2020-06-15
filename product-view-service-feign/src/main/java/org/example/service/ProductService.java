package org.example.service;

import org.example.client.ProductClientFeign;
import org.example.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaqi
 * @version 1.0
 * @date 2020/6/15 17:22
 */
@Service
public class ProductService {
    @Autowired
    private ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProducts();
    }
}
