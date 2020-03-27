package br.curso.mvc.boot.dao;

import java.util.List;

import br.curso.mvc.boot.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long Id);
	
	Funcionario findById(Long Id);
	
	List<Funcionario> findAll(); 
}
