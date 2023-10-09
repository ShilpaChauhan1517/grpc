package com.authgrpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.authgrpc.service.JwtUtilService;
import com.authgrpc.service.UserService;
import com.authgrpc.service.Validator;

@SpringBootApplication
public class AuthApplication {
    
	public static void main(String[] args) {
	//	JwtUtilService jwtUtilService = new JwtUtilService();
		SpringApplication.run(AuthApplication.class, args);
//	    String u = "usernames";
//	    String tkn= jwtUtilService.generateToken(u);
//	    System.out.println(tkn);
//	    Validator v = new Validator();
//	    System.out.println(v.validateToken(tkn));
//	 
	    
	
	}
}
