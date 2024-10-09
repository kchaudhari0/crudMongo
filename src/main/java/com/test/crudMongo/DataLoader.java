package com.test.crudMongo;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataLoader implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void run(String... args) throws Exception {
        if (mongoTemplate.collectionExists(Product.class)) {
            mongoTemplate.dropCollection(Product.class);
        }
        loadProductsFromCsv("G:\\Workspace\\crudMongo\\electronics_products.csv");
    }

    private void loadProductsFromCsv(String filePath) {
        List<Product> products = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            String[] values;
            csvReader.readNext(); // Skip header line
            while ((values = csvReader.readNext()) != null) {
                Product product = new Product();
                product.setId((values[0]));
                product.setName(values[1]);
                product.setDescription(values[2]);
                product.setPrice(Double.parseDouble(values[3]));
                product.setQuantity(Long.parseLong(values[4]));
                products.add(product);
            }
            productRepository.saveAll(products); // Save all products to MongoDB
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
