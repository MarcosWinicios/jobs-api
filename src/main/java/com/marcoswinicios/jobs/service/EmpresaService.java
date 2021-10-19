package com.marcoswinicios.jobs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.marcoswinicios.jobs.dto.EmpresaDTO;
import com.marcoswinicios.jobs.entidades.Cidade;
import com.marcoswinicios.jobs.entidades.Empresa;
import com.marcoswinicios.jobs.entidades.TamanhoEmpresa;

@Service
public class EmpresaService {
	
	
	public List<EmpresaDTO> listarTodas() {
		List<EmpresaDTO> empresas = new ArrayList<>();
		Cidade cidade = new Cidade("São Paulo", "SP");
		cidade.setId(1L);
		EmpresaDTO empresa =  new EmpresaDTO(new Empresa(1L,"SuperSim", "Descrição desta empresa Supersim", "https://supersim.com", cidade, TamanhoEmpresa.GRANDE_EMPRESA));
		empresa.setId(1L);
		empresas.add(empresa);
		EmpresaDTO empresa2 =  new EmpresaDTO(new Empresa(2L,"Americanas", "Descrição desta empresa Americanas", "https://americanas.com", cidade, TamanhoEmpresa.GRANDE_EMPRESA));
		empresas.add(empresa2);
		empresa2.setId(1L);
		return empresas;
	}
}
