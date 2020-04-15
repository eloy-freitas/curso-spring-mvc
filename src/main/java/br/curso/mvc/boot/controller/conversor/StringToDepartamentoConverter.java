package br.curso.mvc.boot.controller.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import br.curso.mvc.boot.domain.Departamento;
import br.curso.mvc.boot.service.DepartamentoService;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento>{

	@Autowired
	private DepartamentoService service;
	
	@Override
	public Departamento convert(String text) {
		
		if(text.isEmpty()) {
			return null;
		}
		
		Long id = Long.valueOf(text);
		
		return service.buscarPorId(id);
	}

}
