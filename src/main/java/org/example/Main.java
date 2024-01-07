package org.example;

import org.example.services.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Long id = 2L;
        personService.fundById(id);
    }
}