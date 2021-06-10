package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{
	@Query(value = "select * from User where email=?1 and password=?2",nativeQuery = true)
	User findByemailUserandpasswordUser(String email,String password);
}
