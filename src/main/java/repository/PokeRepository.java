package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.POKEMON;

@Repository
public interface PokeRepository extends JpaRepository<POKEMON, Long>{

}
