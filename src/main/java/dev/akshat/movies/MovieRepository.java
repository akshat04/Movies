package dev.akshat.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository // let the interface know that this a repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {


}
