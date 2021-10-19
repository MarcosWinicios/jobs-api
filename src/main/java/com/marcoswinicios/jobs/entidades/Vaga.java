package com.marcoswinicios.jobs.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_vaga")
public class Vaga {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private boolean remoto;
	private boolean aceitaDeFora;
	private String descricao;
	
	@Column(name = "tipoContrato", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoContrato tipoContrato;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private NivelExperiencia nivelExperiencia;
	
//	@ElementCollection
//	@CollectionTable(name = "tb_skill_vaga",
//			joinColumns = @JoinColumn(name ="vaga_id"))
//	@Column(name = "id_skill", nullable = false)
//	private List<Skill> skills; 
	
	@ManyToMany
	@JoinTable(name = "vaga_skill",
		joinColumns = @JoinColumn(name ="vaga_id"),
		inverseJoinColumns = @JoinColumn(name = "skill_id"))		
	private List<Skill> skills;
	
	@Transient
	private List<String> atividades;
	@Transient
	private List<String> requisitos;
	
	@Column(precision = 10, scale = 2, nullable = true)
	private BigDecimal salario;
	
	
	@Column(name = "dataCadastro", nullable = false)
	private LocalDate dataCriacao;
	private boolean ativa;
	
	public Vaga() {}
	
	

	public Vaga(String titulo, boolean remoto, boolean aceitaDeFora, String descricao, TipoContrato tipoContrato,
			NivelExperiencia nivelExperiencia, List<Skill> skills, List<String> atividades, List<String> requisitos,
			BigDecimal salario, LocalDate dataCriacao, boolean ativa) {
		super();
		this.titulo = titulo;
		this.remoto = remoto;
		this.aceitaDeFora = aceitaDeFora;
		this.descricao = descricao;
		this.tipoContrato = tipoContrato;
		this.nivelExperiencia = nivelExperiencia;
		this.skills = skills;
		this.atividades = atividades;
		this.requisitos = requisitos;
		this.salario = salario;
		this.dataCriacao = dataCriacao;
		this.ativa = ativa;
	}



	public Vaga(Long id, String titulo, boolean remoto, boolean aceitaDeFora, String descricao,
			TipoContrato tipoContrato, NivelExperiencia nivelExperiencia, List<Skill> skills, List<String> atividades,
			List<String> requisitos, BigDecimal salario, LocalDate dataCriacao, boolean ativa) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.remoto = remoto;
		this.aceitaDeFora = aceitaDeFora;
		this.descricao = descricao;
		this.tipoContrato = tipoContrato;
		this.nivelExperiencia = nivelExperiencia;
		this.skills = skills;
		this.atividades = atividades;
		this.requisitos = requisitos;
		this.salario = salario;
		this.dataCriacao = dataCriacao;
		this.ativa = ativa;
	}

		

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isRemoto() {
		return remoto;
	}
	public void setRemoto(boolean remoto) {
		this.remoto = remoto;
	}
	public boolean isAceitaDeFora() {
		return aceitaDeFora;
	}
	public void setAceitaDeFora(boolean aceitaDeFora) {
		this.aceitaDeFora = aceitaDeFora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public NivelExperiencia getNivelExperiencia() {
		return nivelExperiencia;
	}
	public void setNivelExperiencia(NivelExperiencia nivelExperiencia) {
		this.nivelExperiencia = nivelExperiencia;
	}
	public List<Skill> getSkills() {
		return this.skills;
	}
	public List<String> getAtividades() {
		return atividades;
	}
	public List<String> getRequisitos() {
		return requisitos;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
}
