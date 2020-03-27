package br.curso.mvc.boot.dao;

import java.util.List;

import br.curso.mvc.boot.domain.Cargo;

public interface CargoDao {
	
	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Long Id);
	
	Cargo findById(Long Id);
	
	List<Cargo> findAll(); 
}
