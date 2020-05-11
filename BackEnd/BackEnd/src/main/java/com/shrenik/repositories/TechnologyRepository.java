package com.shrenik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrenik.entity.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer>{

}
