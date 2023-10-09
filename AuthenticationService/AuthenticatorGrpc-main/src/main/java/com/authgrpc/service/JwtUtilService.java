package com.authgrpc.service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtUtilService {

	 private final String secretKeyString = "your-secret-key-dygwufwyfewufywfewefwyeffwef0erfjl";
	 private final byte[] decodedKey = secretKeyString.getBytes();
	 private final Key SECRET_KEY = Keys.hmacShaKeyFor(decodedKey);// Change this to your secret key
	 private final long EXPIRATION_TIME = 3600000; // 1 hour in milliseconds
	    
	    public String generateToken(String username) {
	        Date now = new Date();
	        Date expirationDate = new Date(now.getTime() + EXPIRATION_TIME);

	        Map<String, Object> claims = new HashMap<>();
	        claims.put("username", username);

	        return Jwts.builder()
	                .setClaims(claims)
	                .setIssuedAt(now)
	                .setExpiration(expirationDate)
	                .signWith(SECRET_KEY)
	                .compact();
	    }

}
