package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.entity.User;

public interface IUser extends JpaRepository<User, Integer> {
	
	User findByUsername(String name);
	

}
