package service;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import entity.POKEMON;
import jakarta.transaction.Transactional;
import repository.PokeRepository;

@Service
public class Poke_ServiceImpl implements Poke_Service{
	
	@Autowired
	private PokeRepository reposipoke;

	@Override

	public Iterable<POKEMON> findAll() {
		// TODO Auto-generated method stub
		return reposipoke.findAll();
	}

//	@Override
//	public Page<POKEMON> findAll(Pageable pageable) {
//		// TODO Auto-generated method stub
//		return reposipoke.findAll(pageable);
//	}

	@Override
	public Optional<POKEMON> findById(Long codigo) {
		// TODO Auto-generated method stub
		return reposipoke.findById(codigo);
	}

	@Override
	public POKEMON save(POKEMON poke) {
		// TODO Auto-generated method stub
		return reposipoke.save(poke);
	}

	@Override
	public void deleteById(Long id) {
		reposipoke.deleteById(id);
		
	}

}
