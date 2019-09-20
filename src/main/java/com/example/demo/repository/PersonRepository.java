package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@EnableMongoRepositories
public interface PersonRepository extends MongoRepository<Person, String> {

  public Person findByFirstName(String firstName);

  public List<Person> findByAge(int age);

}
