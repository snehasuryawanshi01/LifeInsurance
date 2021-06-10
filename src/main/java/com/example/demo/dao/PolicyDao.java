package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Policy;

public interface PolicyDao extends JpaRepository<Policy, Integer>{
	
	@Query(value = "select * from Policy where pid=:pid",nativeQuery = true)
	Policy findByClientName(int pid);
	
	
	@Query(value = "select * from Policy where fnm=:cname",nativeQuery = true)
	List<Policy> ClientList(String cname);
	
	@Modifying
	@Query(value = "delete from Policy where pid=:pid",nativeQuery = true)
	int DeleteByID(int pid);
	
}
