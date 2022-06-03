package br.com.academia.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academia.entity.Aluno;
import br.com.academia.entity.AvaliacaoFisica;
import br.com.academia.entity.form.AlunoForm;
import br.com.academia.entity.form.AlunoUpdateForm;
import br.com.academia.infra.utils.JavaTimeUtils;
import br.com.academia.repository.AlunoRepository;
import br.com.academia.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());
		
		return alunoRepository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		return null;
	}

	@Override
	public List<Aluno> getAll(String dataDeNascimento) {
		if (dataDeNascimento == null) {
			return alunoRepository.findAll();
		} else {
			LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
			
			return alunoRepository.findByDataDeNascimento(localDate);
		}
	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm updateForm) {
		return null;
	}

	@Override
	public void delete(Long id) {
		
	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
		Aluno aluno = alunoRepository.findById(id).get();
		
		return aluno.getAvaliacoes();
	}
}