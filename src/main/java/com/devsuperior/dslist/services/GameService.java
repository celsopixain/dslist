package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//Registrar no sistema. Componente de sistema. Precisam ser registrado. Pois, o framework que vai gerenciar
//Para registrar só @Service. Injetar dependencias de componentes do sistema


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	//Devolver um dto
	public List<GameMinDTO> findAll(){
		//Consulta no BD
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	}
	
}
