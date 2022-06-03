package br.com.academia.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.academia.entity.Matricula;
import br.com.academia.entity.form.MatriculaForm;
import br.com.academia.service.impl.MatriculaServiceImpl;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private MatriculaServiceImpl matriculaServiceImpl;
	
	@PostMapping
	public Matricula create(@Valid @RequestBody MatriculaForm form) {
		return matriculaServiceImpl.create(form);
	}
	
	@GetMapping
	public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
		return matriculaServiceImpl.getAll(bairro);
	}
}