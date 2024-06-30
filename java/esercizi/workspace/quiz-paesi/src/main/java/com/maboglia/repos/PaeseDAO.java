package com.maboglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.maboglia.entities.Paese;

public interface PaeseDAO extends JpaRepository<Paese, String> {

	@Query(value = "select * from country order by rand() limit :limite",nativeQuery = true)
	List<Paese> findPaesiRandom(@Param("limite") int numero);
	
}
