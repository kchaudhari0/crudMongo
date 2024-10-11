package com.test.crudMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){

        List<Product> items = productService.getAllProducts();
        return new ResponseEntity(items, HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id){
        Optional<Product> item=productService.getProductById(id);
        return new ResponseEntity(item, HttpStatus.OK);
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product){
        return productService.updateProduct(id , product);
    }
    
    @DeleteMapping("/product/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id){
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // Or return an error response
        }
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/search")
    public List<Product> findProductsByName(@RequestParam String name) {
        return productService.findProductsByName(name);
    }
}
