package com.costamagna.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.costamagna.entities.ContoCorrente;

public interface ContoCorrenteDAO extends JpaRepository<ContoCorrente, Integer> {

}
