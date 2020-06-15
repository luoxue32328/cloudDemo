package org.example.cloud.ribbion.service;

import org.example.cloud.product.pojo.Product;
import org.example.cloud.ribbion.client.ProductClientRibbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaqi
 * @version 1.0
 * @date 2020/6/15 15:19
 */
@Service
public class ProductService {
    @Autowired
    private ProductClientRibbon productClientRibbon;

    public List<Product> listProducts() {
        return productClientRibbon.listProducts();
    }
}
