package com.marcoswinicios.jobs.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.marcoswinicios.jobs.entidades.NivelExperiencia;
import com.marcoswinicios.jobs.entidades.Skills;
import com.marcoswinicios.jobs.entidades.TipoContrato;
import com.marcoswinicios.jobs.entidades.Vaga;

public class VagaDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String titulo;
	private boolean remoto;
	private boolean aceitaDeFora;
	private String descricao;
	private TipoContrato tipoContrato;
	private NivelExperiencia nivelExperiencia;
	private List<Skills> skills; 	
	private List<String> atividades;
	private List<String> requisitos;
	private BigDecimal salario;
	private LocalDate dataCriacao;
	private boolean ativa;
	
	public VagaDTO() {}
	
	public VagaDTO(Vaga vaga) {
		this.id = vaga.getId();
		this.titulo =  vaga.getTitulo();
		this.remoto = vaga.isRemoto();
		this.aceitaDeFora = vaga.isAceitaDeFora();
		this.descricao =  vaga.getDescricao();
		this.tipoContrato = vaga.getTipoContrato();
		this.nivelExperiencia = vaga.getNivelExperiencia();
		this.skills =  vaga.getSkills();
		this.atividades =  vaga.getAtividades();
		this.requisitos = vaga.getRequisitos();
		this.salario = vaga.getSalario();
		this.dataCriacao = vaga.getDataCriacao();
		this.ativa = vaga.isAtiva();
	}
	
	public VagaDTO(String titulo, boolean remoto, boolean aceitaDeFora, String descricao, TipoContrato tipoContrato,
			NivelExperiencia nivelExperiencia, List<Skills> skills, List<String> atividades, List<String> requisitos) {
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
	}
	public VagaDTO(Long id, String titulo, boolean remoto, boolean aceitaDeFora, String descricao,
			TipoContrato tipoContrato, NivelExperiencia nivelExperiencia, List<Skills> skills, List<String> atividades,
			List<String> requisitos) {
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
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	public List<String> getAtividades() {
		return atividades;
	}
	public void setAtividades(List<String> atividades) {
		this.atividades = atividades;
	}
	public List<String> getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(List<String> requisitos) {
		this.requisitos = requisitos;
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
	public BigDecimal getSalario() {
		return salario;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
}
