package dev.akshat.movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @GetMapping
    public ResponseEntity<String> allMovies(){
        // RespnseEntity represent the whole HTTP response. Can use to fully configure the HTTP reponse.
        return new ResponseEntity<String>("All Movies", HttpStatus.OK);

    }
}
