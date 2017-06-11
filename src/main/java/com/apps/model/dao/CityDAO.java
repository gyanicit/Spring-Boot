package com.apps.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.apps.domain.City;

@Transactional
public interface CityDAO extends CrudRepository<City, Long>{
	
}
