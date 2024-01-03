package dev.akshat.movies;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Movies") // let the framework know that this class represents each document in the movies collection
@Data // takes care of all getter setter and to string methods.
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
    private List<String> reviewIDs;


}

