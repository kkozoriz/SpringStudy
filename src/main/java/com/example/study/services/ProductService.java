package com.example.study.services;

import com.example.study.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    private long id = 0;

    {
        products.add(new Product(++id, "Playstation 5", "Some description", 54990, "Moscow", "Victor Ivanov"));
        products.add(new Product(++id, "Playstation 4", "Some description", 32000, "Surgut", "Ivan Ivanov"));
    }

    public List<Product> listProducts() {
        return products;
    }

    public void saveProducts(Product product) {
        product.setId(++id);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

}
