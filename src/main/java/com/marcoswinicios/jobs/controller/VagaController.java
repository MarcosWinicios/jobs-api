package com.marcoswinicios.jobs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcoswinicios.jobs.dto.VagaDTO;
import com.marcoswinicios.jobs.entidades.Vaga;
import com.marcoswinicios.jobs.repository.VagaRepository;
import com.marcoswinicios.jobs.service.EmpresaService;
import com.marcoswinicios.jobs.service.VagaService;

@RestController
@RequestMapping(value = "/vagas")
public class VagaController implements Controllers<VagaDTO>{
	
	@Autowired
	private VagaService service;
	
	@Autowired
	private VagaRepository repository;
	
	@Autowired
	private EmpresaService empresaService;


	@Override
	public ResponseEntity<Page<VagaDTO>> findAll(Pageable page) {
		Page<VagaDTO> list = service.findAll(page);
		return ResponseEntity.ok(list.map(vaga -> this.setarIdEmpresa(vaga)));
	}

	@Override
	public ResponseEntity<VagaDTO> findById(Long id) {
		Optional<Vaga> vaga = repository.findById(id);
		if(vaga.isPresent()) {
			return ResponseEntity.ok(this.setarIdEmpresa(new VagaDTO(vaga.get())));
		}
		return ResponseEntity.notFound().build();
	}
	
	private VagaDTO setarIdEmpresa(VagaDTO vaga) {
		vaga.setIdEmpresa(empresaService.findByVaga(vaga.getId()).getId());
		return vaga;
	}
	
}


