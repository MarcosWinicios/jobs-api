package com.marcoswinicios.jobs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.marcoswinicios.jobs.dto.CidadeDTO;
import com.marcoswinicios.jobs.dto.EmpresaDTO;
import com.marcoswinicios.jobs.entidades.Cidade;
import com.marcoswinicios.jobs.entidades.Empresa;
import com.marcoswinicios.jobs.entidades.TamanhoEmpresa;
import com.marcoswinicios.jobs.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository repository;
	
	public List<EmpresaDTO> findAll(){
		List<Empresa> result = repository.findAll();
		
		return result
				.stream()
				.map(x -> new EmpresaDTO(x))
				.collect(Collectors.toList());
	}
	
//	public EmpresaDTO findById(Long id) {
//		Optional<Empresa> empresa = repository.findById(id);
//		Empresa e = Empresa.class empresa;
//		if(empresa.isPresent()) {
//			EmpresaDTO empresaDTO = new EmpresaDTO();
//			
//		}
//	}
//	public List<EmpresaDTO> listarTodas() {
//		List<EmpresaDTO> empresas = new ArrayList<>();
//		Cidade cidade = new Cidade("São Paulo", "SP");
//		cidade.setId(1L);
//		EmpresaDTO empresa =  new EmpresaDTO(new Empresa(1L,"SuperSim", "Descrição desta empresa Supersim", "https://supersim.com", cidade, TamanhoEmpresa.GRANDE_EMPRESA));
//		empresa.setId(1L);
//		empresas.add(empresa);
//		EmpresaDTO empresa2 =  new EmpresaDTO(new Empresa(2L,"Americanas", "Descrição desta empresa Americanas", "https://americanas.com", cidade, TamanhoEmpresa.GRANDE_EMPRESA));
//		empresas.add(empresa2);
//		empresa2.setId(1L);
//		return empresas;
//	}
}
