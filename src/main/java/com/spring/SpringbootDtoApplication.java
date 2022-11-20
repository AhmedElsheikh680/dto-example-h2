package com.spring;

import com.spring.model.Location;
import com.spring.model.User;
import com.spring.repo.LocationRepo;
import com.spring.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDtoApplication.class, args);
    }
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private LocationRepo locationRepo;
    @Override
    public void run(String... args) throws Exception {

        Location location = new Location();
        location.setPlace("Cairo");
        location.setDescription("Iam living In Cairo!!");
        location.setLongitude(10.10);
        location.setLatitude(12.12);
        locationRepo.save(location);

        User user = new User();
        user.setEmail("a@a.com");
        user.setFirstName("Ahmed");
        user.setLastName("Mohamed");
        user.setPassword("12345");
        user.setLocation(location);
        userRepo.save(user);

        User user2 = new User();
        user2.setEmail("s@s.com");
        user2.setFirstName("Salem");
        user2.setLastName("Ali");
        user2.setPassword("12345");
        user2.setLocation(location);
        userRepo.save(user2);

        User user3 = new User();
        user3.setEmail("h@h.com");
        user3.setFirstName("Hany");
        user3.setLastName("Eldawi");
        user3.setPassword("12345");
        user3.setLocation(location);
        userRepo.save(user3);

    }
}
