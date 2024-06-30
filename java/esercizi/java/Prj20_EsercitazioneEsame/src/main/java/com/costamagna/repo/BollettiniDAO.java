package com.costamagna.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.costamagna.entities.Bollettini;

public interface BollettiniDAO extends JpaRepository<Bollettini, Integer> {

}
