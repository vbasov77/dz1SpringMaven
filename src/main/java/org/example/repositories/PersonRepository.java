package org.example.repositories;

import org.example.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    public List<Person> persons() {
        Person person1 = new Person(1L, "Bob", 33);
        Person person2 = new Person(2L, "Olga", 40);
        Person person3 = new Person(3L, "Sahra", 42);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        return persons;
    }
}
