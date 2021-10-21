package com.marcoswinicios.jobs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcoswinicios.jobs.dto.CidadeDTO;
import com.marcoswinicios.jobs.entidades.Cidade;
import com.marcoswinicios.jobs.service.CidadeService;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeController {
	
	@Autowired
	private CidadeService service;

	@GetMapping
	public ResponseEntity<List<CidadeDTO>> findAll(){
		List<CidadeDTO> list = new ArrayList<>();
		list = service.findAll();
		return ResponseEntity.ok(list);
	}
}
