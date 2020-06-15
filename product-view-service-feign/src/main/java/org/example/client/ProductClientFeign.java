package org.example.client;


import org.example.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author xiaqi
 * @version 1.0
 * @date 2020/6/15 17:13
 */
@FeignClient("PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
    @GetMapping("/products")
     List<Product> listProducts();
}
