package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.entity.Login;

public interface ILogin extends JpaRepository<Login, String>{

}
