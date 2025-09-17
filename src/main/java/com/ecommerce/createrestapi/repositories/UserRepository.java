package com.ecommerce.createrestapi.repositories;
import com.ecommerce.createrestapi.entities.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepository extends MongoRepository<User, String> {
}
