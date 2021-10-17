package com.marcoswinicios.jobs.entidades;

public class Empresa {
	private Long id;
	private String nome;
	private String descricao;
	private String link;
	private Cidade cidade;
	private TamanhoEmpresa tamanho;
	
	public Empresa() {}
	
	
	public Empresa(String nome, String descricao, String link, Cidade cidade, TamanhoEmpresa tamanho) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.link = link;
		this.cidade = cidade;
		this.tamanho = tamanho;
	}


	public Empresa(Long id, String nome, String descricao, String link, Cidade cidade, TamanhoEmpresa tamanho) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.link = link;
		this.cidade = cidade;
		this.tamanho = tamanho;
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
