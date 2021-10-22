package com.marcoswinicios.jobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcoswinicios.jobs.dto.EmpresaDTO;
import com.marcoswinicios.jobs.service.EmpresaService;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaController implements Controllers<EmpresaDTO> {
	
	@Autowired
	private EmpresaService service;
	
	@Override
	public ResponseEntity<Page<EmpresaDTO>> findAll(Pageable page) {
		Page<EmpresaDTO> list = service.findAll(page);
		return ResponseEntity.ok(list);
	}
}
