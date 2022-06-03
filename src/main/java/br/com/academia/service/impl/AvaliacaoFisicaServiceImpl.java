package br.com.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academia.entity.Aluno;
import br.com.academia.entity.AvaliacaoFisica;
import br.com.academia.entity.form.AvaliacaoFisicaForm;
import br.com.academia.entity.form.AvaliacaoFisicaUpdateForm;
import br.com.academia.repository.AlunoRepository;
import br.com.academia.repository.AvaliacaoFisicaRepository;
import br.com.academia.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

	@Autowired
	private AvaliacaoFisicaRepository avaliacaoRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
		AvaliacaoFisica avaliacao = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		
		avaliacao.setAluno(aluno);
		avaliacao.setPeso(form.getPeso());
		avaliacao.setAltura(form.getAltura());
		
		return avaliacaoRepository.save(avaliacao);
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		return avaliacaoRepository.findAll();
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm updateForm) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}
}