package com.costamagna.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.costamagna.entities.Bollettino;

public interface BollettinoDAO extends JpaRepository<Bollettino, Integer> {

}
