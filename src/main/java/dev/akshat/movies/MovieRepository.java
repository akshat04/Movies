package dev.akshat.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository // let the interface know that this a repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
        Optional<Movie> findMovieByImdbId(String imdbId);
        // Just by naming the method findMoviebyImdbId mongodb Spring data will understand
        // what we are trying to do.

}
