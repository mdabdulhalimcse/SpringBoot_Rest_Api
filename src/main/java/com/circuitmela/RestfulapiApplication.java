package com.circuitmela;

import com.circuitmela.model.User;
import com.circuitmela.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulapiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RestfulapiApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{
        this.userRepository.save(new User("Md Abdul","Halim","halim@gmail.com"));
        this.userRepository.save(new User("Abdul","Halim","ahalim@gmail.com"));
        this.userRepository.save(new User("HS","Shanto","abhalim@gmail.com"));

    }

}
