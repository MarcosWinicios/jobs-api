package com.marcoswinicios.jobs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcoswinicios.jobs.EmpresaDTO;
import com.marcoswinicios.jobs.entidades.Cidade;
import com.marcoswinicios.jobs.entidades.Empresa;
import com.marcoswinicios.jobs.entidades.TamanhoEmpresa;
import com.marcoswinicios.jobs.service.EmpresaService;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaController {
	
	@Autowired
	private EmpresaService service;
	
	@GetMapping
	public ResponseEntity<List<EmpresaDTO>> findAll(){
		List<EmpresaDTO> empresas = service.listarTodas();
		
		
		return ResponseEntity.ok(empresas);
	}
}
