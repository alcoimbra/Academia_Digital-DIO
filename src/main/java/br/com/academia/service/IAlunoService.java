package br.com.academia.service;

import java.util.List;

import br.com.academia.entity.Aluno;
import br.com.academia.entity.AvaliacaoFisica;
import br.com.academia.entity.form.AlunoForm;
import br.com.academia.entity.form.AlunoUpdateForm;

public interface IAlunoService {
	
	Aluno create(AlunoForm form);
	Aluno get(Long id);
	List<Aluno> getAll(String dataDeNascimento);
	Aluno update(Long id, AlunoUpdateForm updateForm);
	void delete(Long id);
	List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}