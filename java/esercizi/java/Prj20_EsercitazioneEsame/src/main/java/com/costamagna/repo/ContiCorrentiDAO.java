package com.costamagna.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.costamagna.entities.ContiCorrenti;

public interface ContiCorrentiDAO extends JpaRepository<ContiCorrenti, Integer> {

}
