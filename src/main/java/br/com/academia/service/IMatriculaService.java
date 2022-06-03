package br.com.academia.service;

import java.util.List;

import br.com.academia.entity.Matricula;
import br.com.academia.entity.form.MatriculaForm;

public interface IMatriculaService {
	
	Matricula create(MatriculaForm form);
	Matricula get(Long id);
	List<Matricula> getAll(String bairro);
	void delete(Long id);
}