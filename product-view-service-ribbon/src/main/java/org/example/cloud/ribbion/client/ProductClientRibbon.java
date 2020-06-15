package org.example.cloud.ribbion.client;
import org.example.cloud.product.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author xiaqi
 * @version 1.0
 * @date 2020/6/15 15:13
 */
@Component
public class ProductClientRibbon {
    @Autowired
    private RestTemplate restTemplate;

    public List<Product> listProducts(){
        return restTemplate.getForObject("http://product-data-service/products",List.class);
    }
}
