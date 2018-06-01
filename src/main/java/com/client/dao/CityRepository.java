package com.client.dao;

import com.client.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author FaceFeel
 * @Created 2018-04-17 13:27
 **/
@Repository
public interface CityRepository extends CrudRepository<City,Integer> {

    List<City> findAll();
}
