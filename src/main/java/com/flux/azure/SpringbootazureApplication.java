package com.flux.azure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootazureApplication {
	@Autowired
	PersonRepository repository;
	@PostMapping("/person")
    public Person addPerson(@RequestBody Person person) {
        return repository.save(person);
    }

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return repository.findAll();
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringbootazureApplication.class, args);
	}

}
