package com.shrenik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shrenik.entity.Technology;

@CrossOrigin("http://localhost:4200")
public interface TechnologyRepository extends JpaRepository<Technology, Integer>{

}
