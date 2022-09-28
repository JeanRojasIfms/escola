package br.edu.ifms.escola.dto;

import java.io.Serializable;

import br.edu.ifms.escola.model.Turma;

public class TurmaDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String turma;
	
	public TurmaDto() {
		// TODO Auto-generated constructor stub
	}

	public TurmaDto(Turma obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.turma = obj.getTurma();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
	

}
