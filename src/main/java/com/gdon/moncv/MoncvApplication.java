package com.gdon.moncv;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoncvApplication {
    
    @RequestMapping("/resource")
    public Map<String,Object> home(){
        Map<String,Object> model = new HashMap<>();
        model.put("id",UUID.randomUUID().toString());
        model.put("content","Bonjour !");
        return model;
    }
    
    @RequestMapping("/user")
    public Principal user(Principal user){
        return user;
    }
    
	public static void main(String[] args) {
		SpringApplication.run(MoncvApplication.class, args);
	}
}
