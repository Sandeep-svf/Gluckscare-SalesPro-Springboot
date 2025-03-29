package com.gluckscare.services;

import com.gluckscare.entitiy.HeadOfficeEntity;
import com.gluckscare.entitiy.UserEntity;
import com.gluckscare.repository.HeadOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Component
public class HeadOfficeService {

    @Autowired
    HeadOfficeRepository headOfficeRepository;

    @Autowired
    UserService userService;


    public void saveHeadOffice(HeadOfficeEntity headOffice){
        try {
            headOffice.setDate(LocalDateTime.now());
            headOfficeRepository.save(headOffice);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
