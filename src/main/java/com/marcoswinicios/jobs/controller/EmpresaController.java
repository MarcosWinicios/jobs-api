package com.marcoswinicios.jobs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcoswinicios.jobs.dto.EmpresaDTO;
import com.marcoswinicios.jobs.entidades.Empresa;
import com.marcoswinicios.jobs.repository.EmpresaRepository;
import com.marcoswinicios.jobs.service.EmpresaService;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaController implements Controllers<EmpresaDTO> {
	
	@Autowired
	private EmpresaService service;
	@Autowired
	private EmpresaRepository repository;
	
	@Override
	public ResponseEntity<Page<EmpresaDTO>> findAll(Pageable page) {
		Page<EmpresaDTO> list = service.findAll(page);
		return ResponseEntity.ok(list);
	}

	@Override
	public ResponseEntity<EmpresaDTO> findById(Long id) {
		Optional<Empresa> empresa = repository.findById(id);
		if(empresa.isPresent()) {
			return ResponseEntity.ok(new EmpresaDTO(empresa.get()));
		}
		return ResponseEntity.notFound().build();
	}
}
