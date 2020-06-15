package org.example.cloud.ribbion.web;

import org.example.cloud.product.pojo.Product;
import org.example.cloud.ribbion.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author xiaqi
 * @version 1.0
 * @date 2020/6/15 15:22
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/products")
    public Object listProducts(Model model){
        List<Product> products = productService.listProducts();
        model.addAttribute("ps",products);
        return "products";


    }
}
