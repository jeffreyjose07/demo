package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  //create operation
  public Person create(String id, String firstName, String lastName, int age) {
    return personRepository.save(new Person(id, firstName, lastName, age));
  }

  //retrieve operation
  public List<Person> getAll() {
    return personRepository.findAll();
  }

  public Person getByFirstName(String firstName) {
    return personRepository.findByFirstName(firstName);
  }

  public List<Person> getByAge(int age) {
    return personRepository.findByAge(age);
  }

  //update operation
  public Person update(String firstName, String lastName, int age) {
    Person oldPerson = personRepository.findByFirstName(firstName);
    oldPerson.setLastName(lastName);
    oldPerson.setAge(age);
    return personRepository.save(oldPerson);
  }

  //delete operation
  public void deleteAll() {
    personRepository.deleteAll();
  }

  public void delete(String firstName) {
    Person deletedPerson = personRepository.findByFirstName(firstName);
    personRepository.delete(deletedPerson);
  }
}
