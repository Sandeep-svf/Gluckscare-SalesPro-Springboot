package com.gluckscare.Controller;

import com.gluckscare.entitiy.DoctorEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @PostMapping("/add-doctor")
    public void addDoctor(@RequestBody DoctorEntity doctorEntity){

    }

}
