package br.com.academia.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.academia.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
}