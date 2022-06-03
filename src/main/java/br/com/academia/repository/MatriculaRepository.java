package br.com.academia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.academia.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

	@Query(value = "SELECT * FROM tb_matriculas m " +
					"INNER JOIN tb_alunos a ON m.alunos_id = a.id " +
					"WHERE a.bairro = :bairro", nativeQuery = true)
	List<Matricula> findAlunosMatriculadosBairro(String bairro);
}