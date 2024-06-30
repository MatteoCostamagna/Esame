package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.PokemonPict;

public interface PokemonPictDAO extends JpaRepository<PokemonPict, String> {

}
