package com.marcoswinicios.jobs.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vaga")
public class Vaga {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private boolean remoto;
	private boolean aceitaDeFora;
	
	@Column(name = "tipoContrato", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoContrato tipoContrato;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private NivelExperiencia nivelExperiencia;
	
	@ManyToMany
	@JoinTable(name = "tb_vaga_skill",
		joinColumns = @JoinColumn(name ="vaga_id"),
		inverseJoinColumns = @JoinColumn(name = "skill_id"))		
	private List<Skill> skills;
	
	@Column(columnDefinition = "text")
	private String atividades;
	
	@Column(columnDefinition = "text")
	private String requisitos;
	
	@Column(precision = 10, scale = 2, nullable = true)
	private BigDecimal salario;
	
	@ManyToMany
	@JoinTable(name = "tb_beneficio_vaga", 
		joinColumns = @JoinColumn(name = "vaga_id"),
		inverseJoinColumns = @JoinColumn(name = "beneficio_id"))
	private List<Beneficio> beneficios;
	
	@Column(name = "dataCadastro", nullable = false)
	private LocalDate dataCriacao;
	private boolean ativa;
	
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
	
	public Vaga() {}
	
	public Vaga(String titulo, boolean remoto, boolean aceitaDeFora, TipoContrato tipoContrato,
			NivelExperiencia nivelExperiencia, List<Skill> skills, String atividades, String requisitos,
			BigDecimal salario, LocalDate dataCriacao, boolean ativa, List<Beneficio> beneficios) {
		super();
		this.titulo = titulo;
		this.remoto = remoto;
		this.aceitaDeFora = aceitaDeFora;
		this.tipoContrato = tipoContrato;
		this.nivelExperiencia = nivelExperiencia;
		this.skills = skills;
		this.atividades = atividades;
		this.requisitos = requisitos;
		this.salario = salario;
		this.dataCriacao = dataCriacao;
		this.ativa = ativa;
		this.beneficios = beneficios;
	}

	public Vaga(Long id, String titulo, boolean remoto, boolean aceitaDeFora,
			TipoContrato tipoContrato, NivelExperiencia nivelExperiencia, List<Skill> skills, String atividades,
			String requisitos, BigDecimal salario, LocalDate dataCriacao, boolean ativa, List<Beneficio> beneficios) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.remoto = remoto;
		this.aceitaDeFora = aceitaDeFora;
		this.tipoContrato = tipoContrato;
		this.nivelExperiencia = nivelExperiencia;
		this.skills = skills;
		this.atividades = atividades;
		this.requisitos = requisitos;
		this.salario = salario;
		this.dataCriacao = dataCriacao;
		this.ativa = ativa;
		this.beneficios = beneficios;
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
	public List<Beneficio> getBeneficios() {
		return beneficios;
	}
	public String getAtividades() {
		return atividades;
	}
	public void setAtividades(String atividades) {
		this.atividades = atividades;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
}
