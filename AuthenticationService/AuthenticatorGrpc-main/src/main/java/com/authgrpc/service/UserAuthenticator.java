package com.authgrpc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authgrpc.model.User;
@Service
public class UserAuthenticator {
	// Implement your own authentication logic here
	@Autowired
	UserService userService;
	
     boolean authenticateUser(String username, String password) {
        // Replace this with your actual authentication logic
        // For example, querying a database to verify the credentials
        // Return true if the credentials are valid, otherwise false
        // You can also consider using a library like Spring Security for authentication
    	 
    	 System.out.println(username);
    	// System.out.println(userService.getUserById(1));
//    	if( userService.checkUserAvailable(username)){
//    		return false;
//    	}
//    	User user = userService.getUserByName(username);
//    	String userNameFromDb=user.getUserName();
//    	String passwordFromDb=user.getPassword();
    	 String userNameFromDb="user1";
    	String passwordFromDb="123456";
        return username.equals(userNameFromDb) && password.equals(passwordFromDb);
    }

}
