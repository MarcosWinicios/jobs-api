package com.marcoswinicios.jobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcoswinicios.jobs.dto.VagaDTO;
import com.marcoswinicios.jobs.service.VagaService;

@RestController
@RequestMapping(value = "/vagas")
public class VagaController {
	
	@Autowired
	private VagaService service;
	
	@GetMapping
	public ResponseEntity<List<VagaDTO>> findAll(){
		List<VagaDTO> vagas =  service.listarTodas();
		
		return ResponseEntity.ok(vagas);
	}
}
