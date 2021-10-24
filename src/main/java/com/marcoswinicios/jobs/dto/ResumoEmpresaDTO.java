package com.marcoswinicios.jobs.dto;

import java.io.Serializable;

import com.marcoswinicios.jobs.entidades.Empresa;
import com.marcoswinicios.jobs.entidades.TamanhoEmpresa;

public class ResumoEmpresaDTO implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private Long idEmpresa;
	private String nomeEmpresa;
	private TamanhoEmpresa tamanhoEmpresa;
	private String descricaoEmpresa;
	
	public ResumoEmpresaDTO() {}
	
	public ResumoEmpresaDTO(Empresa empresa) {
		this.idEmpresa = empresa.getId();
		this.nomeEmpresa = empresa.getNome();
		this.tamanhoEmpresa = empresa.getTamanho();
		this.descricaoEmpresa = empresa.getDescricao();
	}
	
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public TamanhoEmpresa getTamanhoEmpresa() {
		return tamanhoEmpresa;
	}
	public void setTamanhoEmpresa(TamanhoEmpresa tamanhoEmpresa) {
		this.tamanhoEmpresa = tamanhoEmpresa;
	}
	public String getDescricaoEmpresa() {
		return descricaoEmpresa;
	}
	public void setDescricaoEmpresa(String descricaoEmpresa) {
		this.descricaoEmpresa = descricaoEmpresa;
	}
	
}
