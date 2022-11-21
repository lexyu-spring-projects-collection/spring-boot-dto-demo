package com.lex;

import com.lex.entity.Location;
import com.lex.entity.User;
import com.lex.repository.LocationRepository;
import com.lex.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringDtoDemoApplication implements CommandLineRunner {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDtoDemoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Taipei");
		location.setDescription("The Place is Hard to Live");
		location.setLongitude(121.30);
		location.setLatitude(25.03);
		locationRepository.save(location);

		List<User> list = List.of(
				new User("Lex@gmail.com","Lex","Yu","p@ssw0rd", location) ,
				new User("test@gmail.com","testF","testL","secret", location)
		);

		userRepository.saveAll(list);
	}
}
