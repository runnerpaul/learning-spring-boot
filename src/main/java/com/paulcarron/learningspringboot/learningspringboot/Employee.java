package com.paulcarron.learningspringboot.learningspringboot;

import lombok.Data;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "employees")
public class Employee {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String role;

}
