package com.marcoswinicios.jobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcoswinicios.jobs.dto.VagaDTO;
import com.marcoswinicios.jobs.service.VagaService;

@RestController
@RequestMapping(value = "/vagas")
public class VagaController implements Controllers<VagaDTO>{
	
	@Autowired
	private VagaService service;

	@Override
	public ResponseEntity<Page<VagaDTO>> findAll(Pageable page) {
		Page<VagaDTO> list = service.findAll(page);
		
		return ResponseEntity.ok(list);
	}
}
