package dev.akshat.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    private ObjectId id;
    private String body;
    //We have an Allargsconstructor and noArgsConstructor but since IDs are autogenrated we cannot
    //pass an id to this class. So,
    //Creating a custom constructor that takes only the body.
    public Review(String body) {
        this.body = body;
    }
}
