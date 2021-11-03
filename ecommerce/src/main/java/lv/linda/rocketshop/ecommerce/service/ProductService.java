package lv.linda.rocketshop.ecommerce.service;

import com.sun.istack.NotNull;
import lv.linda.rocketshop.ecommerce.repository.Product;
import org.springframework.validation.annotation.Validated;


import javax.validation.constraints.Min;

@Validated
public interface ProductService {

    @NotNull Iterable<Product> getAllProducts();

    Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id) throws Exception;

    Product save(Product product);
}
