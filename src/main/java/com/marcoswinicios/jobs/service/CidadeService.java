package com.marcoswinicios.jobs.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcoswinicios.jobs.dto.CidadeDTO;
import com.marcoswinicios.jobs.entidades.Cidade;
import com.marcoswinicios.jobs.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repository;
	
	public List<CidadeDTO> findAll(){
		List<Cidade> result = repository.findAll();
		return result
				.stream()
				.map(x -> new CidadeDTO(x)).collect(Collectors.toList());
	}
}
