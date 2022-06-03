package br.com.academia.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.academia.entity.Aluno;
import br.com.academia.entity.AvaliacaoFisica;
import br.com.academia.entity.form.AlunoForm;
import br.com.academia.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoServiceImpl alunoServiceImpl;
	
	@PostMapping
	public Aluno create(@Valid @RequestBody AlunoForm form) {
		return alunoServiceImpl.create(form);
	}
	
	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
		return alunoServiceImpl.getAllAvaliacaoFisicaId(id);
	}
	
	@GetMapping
	public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNascimento) {
		return alunoServiceImpl.getAll(dataDeNascimento);
	}
}