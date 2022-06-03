package br.com.academia.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {
	
	private Long alunoId;
	private Double peso;
	private Double altura;
	
	public Long getAlunoId() {
		return alunoId;
	}
	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
}