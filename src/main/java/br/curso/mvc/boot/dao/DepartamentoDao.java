package br.curso.mvc.boot.dao;

import java.util.List;

import br.curso.mvc.boot.domain.Departamento;

public interface DepartamentoDao {

	void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Long Id);
	
	Departamento findById(Long Id);
	
	List<Departamento> findAll(); 
}
