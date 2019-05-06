package car.rest;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Persistence;

@SpringBootApplication
public class MainApplicationClass {
    public static void main(String[] args){
        SpringApplication.run(MainApplicationClass.class, args);
    }
}
