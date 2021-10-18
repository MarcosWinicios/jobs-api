package com.marcoswinicios.jobs.dto;

import java.io.Serializable;

import com.marcoswinicios.jobs.entidades.Cidade;
import com.marcoswinicios.jobs.entidades.Empresa;
import com.marcoswinicios.jobs.entidades.TamanhoEmpresa;

public class EmpresaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String descricao;
	private String link;
	private Cidade cidade;
	private TamanhoEmpresa tamanho;
	
	
	public EmpresaDTO() {}
	
	
	public EmpresaDTO(Empresa empresa) {
		this.nome = empresa.getNome();
		this.descricao =  empresa.getDescricao();
		this.link = empresa.getLink();
		this.cidade = empresa.getCidade();
		this.tamanho =  empresa.getTamanho();
	}
	
	public EmpresaDTO(String nome) {
		this.nome = nome;
	}
	
	public EmpresaDTO(Long id, String nome) {
		this.id = id;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public TamanhoEmpresa getTamanho() {
		return tamanho;
	}
	public void setTamanho(TamanhoEmpresa tamanho) {
		this.tamanho = tamanho;
	}
}
