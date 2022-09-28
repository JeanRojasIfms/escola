package br.edu.ifms.escola.dto;

import java.io.Serializable;

import br.edu.ifms.escola.model.Curso;

public class CursoDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String anoDuracao;
	
	public CursoDto() {
		// TODO Auto-generated constructor stub
	}

	public CursoDto(Curso obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.anoDuracao = obj.getAnoDuracao();
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

	public String getAnoDuracao() {
		return anoDuracao;
	}

	public void setAnoDuracao(String anoDuracao) {
		this.anoDuracao = anoDuracao;
	}
	
	
	

}
