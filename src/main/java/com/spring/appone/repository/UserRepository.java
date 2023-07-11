package com.spring.appone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.appone.repository.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,String>{

}
