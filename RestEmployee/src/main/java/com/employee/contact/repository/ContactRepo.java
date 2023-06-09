package com.employee.contact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.contact.model.EmpContact;
@Repository
public interface ContactRepo extends JpaRepository<EmpContact, Integer> {
	@Query(value = "Select * from springboot.empcontact where isactive = 1;", nativeQuery = true)
	public List<EmpContact> findByIsActive();
}
