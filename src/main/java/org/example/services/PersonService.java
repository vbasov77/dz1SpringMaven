package org.example.services;


import org.example.models.Person;
import org.example.repositories.PersonRepository;

import java.util.List;
import java.util.Objects;

public class PersonService {

    public void fundById(Long id) {
        PersonRepository personRepository = new PersonRepository();
        List<Person> all = personRepository.persons();
        all.stream().filter(s -> Objects.equals(s.getId(), id)).forEach(System.out::println);
    }
}
