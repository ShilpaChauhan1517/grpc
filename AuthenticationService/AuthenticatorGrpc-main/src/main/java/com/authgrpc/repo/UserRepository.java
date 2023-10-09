package com.authgrpc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authgrpc.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUserName(String userName); // Find user by username
    boolean existsByUserName(String userName); // Check if a user with a specific username exists
}
