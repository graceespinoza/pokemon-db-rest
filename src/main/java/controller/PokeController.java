package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.POKEMON;
import repository.PokeRepository;
import service.Poke_Service;

@RestController
@RequestMapping("/pokemon/users")
public class PokeController {
	
	@Autowired Poke_Service servipoke;
	
	@PostMapping("/")
	public ResponseEntity<?> create (@RequestBody POKEMON poke){
    	return ResponseEntity.status(HttpStatus.CREATED).body(servipoke.save(poke));

	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> red (@PathVariable (value = "id") Long codigo){
		Optional<POKEMON> poke = servipoke.findById(codigo);
    	
    	if(!poke.isPresent()) {
    		return ResponseEntity.notFound().build();
    		
    	}
    		return ResponseEntity.ok(poke);
	}
	
}
