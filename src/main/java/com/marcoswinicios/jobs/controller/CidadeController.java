package com.marcoswinicios.jobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcoswinicios.jobs.dto.CidadeDTO;
import com.marcoswinicios.jobs.service.CidadeService;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeController {
	
	@Autowired
	private CidadeService service;

	@GetMapping
	public ResponseEntity<Page<CidadeDTO>> findAll(Pageable page){
		Page<CidadeDTO> list = service.findAll(page);
		return ResponseEntity.ok(list);
	}
}
