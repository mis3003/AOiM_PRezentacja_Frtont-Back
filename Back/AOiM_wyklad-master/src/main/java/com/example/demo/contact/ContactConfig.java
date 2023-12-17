package com.example.demo.contact;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ContactConfig {
    @Bean
    CommandLineRunner commandLineRunner(ContactRepository repository)
    {
        return args -> {
//            Contact a = new Contact("Julia","503453122", "email");
//            Contact b = new Contact("łukasz","60892525", "email");
//            Contact c = new Contact("Patryk","60892525", "email");
//            Contact d = new Contact("Michał","60892525", "email");
//            Contact e = new Contact("Kuba","60892525", "email");
//            Contact f = new Contact("Jean Barą","60892525", "email");
            repository.saveAll(List.of( /*a,b, c, d, e ,f*/ ));
        };
    }
}
