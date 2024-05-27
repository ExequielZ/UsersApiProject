package com.bci.users;

import com.bci.users.model.Phone;
import com.bci.users.model.User;
import com.bci.users.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsersApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApiApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> {
			User user = new User("Jhon Doe", "jhon.doe@gmail.com", "JhonDoePass");
			Phone phone1 = new Phone(null, "456030", "343", "+54", user);
			Phone phone2 = new Phone(null, "456031", "342", "+54", user);
			user.getPhones().add(phone1);
			user.getPhones().add(phone2);
			userRepository.save(user);
		};
	}
}
