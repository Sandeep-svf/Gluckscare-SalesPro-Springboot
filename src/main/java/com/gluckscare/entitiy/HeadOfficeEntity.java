package com.gluckscare.entitiy;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collection = "headoffice")
@Data
public class HeadOfficeEntity {
    @Id
    private ObjectId id;

    @Indexed(unique = true)
    @NonNull
    private String name;

    private LocalDateTime date;
}
