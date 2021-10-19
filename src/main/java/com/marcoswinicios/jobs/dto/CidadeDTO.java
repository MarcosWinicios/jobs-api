package com.marcoswinicios.jobs.dto;

import java.io.Serializable;

import com.marcoswinicios.jobs.entidades.Cidade;

public class CidadeDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String cidade;
	private String estado;
	
	public CidadeDTO() {}
	
	public CidadeDTO(Long id, String cidade, String estado) {
		this.id = id;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public CidadeDTO(Cidade entity) {
		this.id = entity.getId();
		this.cidade = entity.getNome();
		this.estado = entity.getEstado();
	}	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
