package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

//Classe e tipo do Id. No caso long
public interface GameRepository extends JpaRepository<Game, Long>{
	
}
