package br.com.academia.service;

import java.util.List;

import br.com.academia.entity.AvaliacaoFisica;
import br.com.academia.entity.form.AvaliacaoFisicaForm;
import br.com.academia.entity.form.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {
	
	AvaliacaoFisica create(AvaliacaoFisicaForm form);
	AvaliacaoFisica get(Long id);
	List<AvaliacaoFisica> getAll();
	AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm updateForm);
	void delete(Long id);
}