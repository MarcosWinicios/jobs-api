package com.marcoswinicios.jobs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.marcoswinicios.jobs.dto.EmpresaDTO;
import com.marcoswinicios.jobs.entidades.Empresa;
import com.marcoswinicios.jobs.repository.EmpresaRepository;

@Service
public class EmpresaService implements Services<EmpresaDTO> {
	
	@Autowired
	private EmpresaRepository repository;
	
	@Override
	public Page<EmpresaDTO> findAll(Pageable pageable) {
		Page<Empresa> result = repository.findAll(pageable);
		return result.map(x -> new EmpresaDTO(x));
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
