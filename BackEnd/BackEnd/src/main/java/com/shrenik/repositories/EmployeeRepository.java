package com.shrenik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shrenik.entity.Employee;

@CrossOrigin("http://localhost:4200")
@RestResource
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
