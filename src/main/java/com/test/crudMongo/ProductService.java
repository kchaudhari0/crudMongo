package com.test.crudMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {

        return Optional.ofNullable(productRepository.findById(id).orElseThrow(() -> new RuntimeException("No data is present with this ID")));
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(String id,Product product) {
        if(productRepository.existsById(id))
        {
            product.setId(id);
            return productRepository.save(product);
        }
        else
        {
            throw new RuntimeException("No data is present with this ID");
        }
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    public List<Product> findProductsByName(String name) {
        return productRepository.findAllByName(name);
    }
}
