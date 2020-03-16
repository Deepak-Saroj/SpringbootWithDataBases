package com.example.Demo2.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo2.entity.User;
@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
}