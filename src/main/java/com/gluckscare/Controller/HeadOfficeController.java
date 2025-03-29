package com.gluckscare.Controller;

import com.gluckscare.entitiy.HeadOfficeEntity;
import com.gluckscare.services.HeadOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headoffice")
public class HeadOfficeController {

    @Autowired
    HeadOfficeService headOfficeService;

    @PostMapping("/add-headoffice")
    public ResponseEntity<HeadOfficeEntity> addHeadOffice(@RequestBody HeadOfficeEntity headOfficeEntity){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();
        try{
            headOfficeService.saveHeadOffice(headOfficeEntity);
            return new ResponseEntity<>(headOfficeEntity, HttpStatus.CREATED);
        }catch (Exception e){
            System.out.println(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
