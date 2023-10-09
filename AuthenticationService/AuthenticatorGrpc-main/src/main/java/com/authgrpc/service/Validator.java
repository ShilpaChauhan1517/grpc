package com.authgrpc.service;

import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class Validator {
	private final String secretKeyString = "your-secret-key-dygwufwyfewufywfewefwyeffwef0erfjl";
    private final byte[] decodedKey = secretKeyString.getBytes();
    private final Key SECRET_KEY = Keys.hmacShaKeyFor(decodedKey);
  //Token Validation method
    public boolean validateToken(String token) {
        try {
            Jws<Claims> claimsJws = Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY)
                    .build()
                    .parseClaimsJws(token);

            Claims claims = claimsJws.getBody();

            // You can perform additional validation here, if needed
            // For example, checking expiration, specific claims, etc.
            Date expirationDate = claims.getExpiration();
            Date now = new Date();
            if (expirationDate.before(now)) {
                return false; // Token has expired
            }

            // Check specific claims (if needed)
            String username = claims.get("username", String.class);
            if (username == null || username.isEmpty()) {
                return false; // Username claim is missing or invalid
            }
            return true; // Token is valid
        } catch (Exception e) {
            // Token validation failed
            return false;
        }
    }
}
