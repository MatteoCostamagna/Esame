package com.maboglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maboglia.entities.Paese;

public interface PaeseDAO extends JpaRepository<Paese, String> {

	//derived query
	List<Paese> findByRegion(String region);//query like
	
	@Query(value = "select distinct(region) as region  from countries", nativeQuery = true)
	List<Paese> trovaRegioniDistinte();
}
