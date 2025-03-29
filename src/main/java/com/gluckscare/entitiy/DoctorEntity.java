package com.gluckscare.entitiy;

import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;


@Document(collection = "doctor")
public class DoctorEntity {

    @Id
    private ObjectId id;
    @NonNull
    private String name;
    @NonNull
    private String specialization;
    @NonNull
    private String location;
    @NonNull
    private String email;
    private String phoneNumber;
    private String registrationNumber;
    private Integer yearsOfExperience;
    private Date dob;
    private String gender;
    private Date anniversary;
    @NonNull
    private String headOffice;
}
