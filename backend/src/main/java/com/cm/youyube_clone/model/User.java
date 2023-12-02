package com.cm.youyube_clone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;

}
