package com.shrenik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrenik.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
