package com.marcoswinicios.jobs.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Lob
	@Column(length = 10485760)
	@Transient
	private String descricao;
	private String link;
	
	@ManyToOne
	@JoinColumn(name = "cidade_id")
	private Cidade cidade;
	
	@Column(name = "tamanho", nullable = false)
	@Enumerated(EnumType.STRING)
	private TamanhoEmpresa tamanho;
	
	@OneToMany(mappedBy = "empresa")
	private List<Vaga> vagas;
	
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
	public List<Vaga> getVagas() {
		return vagas;
	}
}
