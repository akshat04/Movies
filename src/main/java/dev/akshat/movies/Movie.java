package dev.akshat.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "Movies") // let the framework know that this class represents each document in the movies collection
@Data // takes care of all getter setter and to string methods.
@AllArgsConstructor // annotation that takes all the private variable as constructors
@NoArgsConstructor // constructor that takes arguments
public class Movie {
    @Id // let the framework know that this property should be treated as a unique identifier for each movie in database.
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    // This is called manual reference relationship
    @DocumentReference // this will cause the database to store only IDs of the review. And the review will be in a separate collection
    private List<String> reviewIDs;

}

