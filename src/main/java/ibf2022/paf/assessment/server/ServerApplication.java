package ibf2022.paf.assessment.server;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ibf2022.paf.assessment.server.models.User;
import ibf2022.paf.assessment.server.repositories.UserRepository;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
	@Autowired
	UserRepository userRepo;

	@Override
	public void run(String... args) {
		// Optional <User> results = userRepo.findUserByUsername("betty");
		
		String results = userRepo.insertUser("kiana", "nana");
		System.out.println(results);
	}
}
