package service;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.data.domain.Page;

import entity.POKEMON;

public interface Poke_Service {
	
	public Iterable<POKEMON> findAll();
	
//	public Page<POKEMON> findAll(Pageable pageable);
		
		public Optional<POKEMON> findById(Long codigo);
		
		public POKEMON save(POKEMON poke);
		
		public void deleteById(Long id);
		
	}


