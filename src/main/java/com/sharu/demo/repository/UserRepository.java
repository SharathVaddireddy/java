package com.sharu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharu.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}