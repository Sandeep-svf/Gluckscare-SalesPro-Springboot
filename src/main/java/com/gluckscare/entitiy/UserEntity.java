package com.gluckscare.entitiy;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
@NoArgsConstructor
public class UserEntity {

    @Id
    private ObjectId id;

    @Indexed(unique = true)
    @NonNull
    private String userName;

    @NonNull
    private String password;

    @DBRef  // user link to journalEntries. act like foreign key here.
    private List<DoctorEntity> journalEntities = new ArrayList<>();
    private List<String> role;

    @DBRef
    private List<ProductEntity> productEntities = new ArrayList<>();

    @DBRef
    private List<SalesEntity> salesEntities = new ArrayList<>();

    @DBRef
    private  List<ExpenseEntity> expenseEntities = new ArrayList<>();

    @DBRef
    private  List<ScheduleEntity> scheduleEntities = new ArrayList<>();



}
