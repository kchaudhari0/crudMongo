package com.test.crudMongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{'name': {$regex: ?0, $options: 'i'}}")
    List<Product> findAllByName(String namePart);
}
