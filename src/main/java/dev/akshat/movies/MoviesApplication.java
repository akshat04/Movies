package dev.akshat.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// annotation are used to the java what this class does.
@SpringBootApplication
@RestController // another annotation that lets the framework know that this is a rest api controller
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

//	@GetMapping("/root") // another annotation that lets the framework know to GET requests onto specific handler methods.
//	public String apiRoot(){
//		return "Hello, World";
//	}

}
