package com.shrenik.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;


import com.shrenik.entity.Employee;
import com.shrenik.entity.Technology;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer  {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config);
		
		config.exposeIdsFor(Technology.class);
		config.exposeIdsFor(Employee.class);
		
	}

}
