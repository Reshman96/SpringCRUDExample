package com.reshman.springcrudexample;

import com.reshman.springcrudexample.entities.UserEntity;
import com.reshman.springcrudexample.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringCrudExampleApplication {

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static void main(String[] args) {
        SpringApplication.run(SpringCrudExampleApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(UserRepository userRepository) {
//        return args -> {
//            userRepository.save(new UserEntity("Resh", encoder.encode("1234"), "ADMIN", 1));
//            userRepository.save(new UserEntity("Reshman", encoder.encode("1234"), "USER", 1));
//        };
//    }
}
