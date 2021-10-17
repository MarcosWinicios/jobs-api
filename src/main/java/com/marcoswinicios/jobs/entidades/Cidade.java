package com.marcoswinicios.jobs.entidades;

public class Cidade {
	private Long id;
	private String nome;
	
	
	public Cidade() {}
	
	public Cidade(String nome) {
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
