package lv.linda.rocketshop.ecommerce.controller;

import lv.linda.rocketshop.ecommerce.repository.Product;
import lv.linda.rocketshop.ecommerce.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping(value = { "", "/" })
    public Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}