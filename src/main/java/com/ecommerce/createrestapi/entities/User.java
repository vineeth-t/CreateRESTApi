package com.ecommerce.createrestapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Document(collection = "users")
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    private ObjectId id;
    private String username;
    private String firstname;
    private String lastname;
    private String password;

}
