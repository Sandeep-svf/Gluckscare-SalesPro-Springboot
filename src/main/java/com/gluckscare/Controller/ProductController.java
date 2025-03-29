package com.gluckscare.Controller;


import com.gluckscare.entitiy.ProductEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    @PostMapping("/add-product")
    public void addProduct(@RequestBody ProductEntity productEntity){
        
    }
    
}
