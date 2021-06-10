package com.example.demo.dao;


	

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer>{
	@Query(value = "select * from admin where adminname=?1 and adpassword=?2",nativeQuery = true)
	Admin findByemailUserandpasswordUser(String adminname,String adpassword);
}


