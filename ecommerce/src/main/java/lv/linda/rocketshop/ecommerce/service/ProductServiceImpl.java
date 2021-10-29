package lv.linda.rocketshop.ecommerce.service;

import lv.linda.rocketshop.ecommerce.repository.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl {
    // productRepository constructor injection

//    @Override
//    public Iterable<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
//
//    @Override
//    public Product getProduct(long id) {
//        return productRepository
//                .findById(id)
//                .orElseThrow(() -> new Exception ("Product not found"));
//    }
//
//    @Override
//    public Product save(Product product) {
//        return productRepository.save(product);
//    }
}
