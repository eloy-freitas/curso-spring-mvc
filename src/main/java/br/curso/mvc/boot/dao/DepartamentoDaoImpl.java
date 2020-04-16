package br.curso.mvc.boot.dao;

import org.springframework.stereotype.Repository;

import br.curso.mvc.boot.domain.Departamento;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {

}
