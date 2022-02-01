package com.raffa.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raffa.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
