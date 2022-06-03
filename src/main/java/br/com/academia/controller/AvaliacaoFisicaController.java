package br.com.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academia.entity.AvaliacaoFisica;
import br.com.academia.entity.form.AvaliacaoFisicaForm;
import br.com.academia.service.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
	
	@Autowired
	private AvaliacaoFisicaServiceImpl avaliacaoServiceImpl;
	
	@PostMapping
	public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
		return avaliacaoServiceImpl.create(form);
	}
	
	@GetMapping
	public List<AvaliacaoFisica> getAll(){
		return avaliacaoServiceImpl.getAll();
	}
}