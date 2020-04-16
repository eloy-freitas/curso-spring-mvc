package br.curso.mvc.boot.dao;

import org.springframework.stereotype.Repository;

import br.curso.mvc.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

}
