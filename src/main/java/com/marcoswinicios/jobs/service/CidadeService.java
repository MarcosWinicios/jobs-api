package com.marcoswinicios.jobs.service;

import java.awt.print.Pageable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.marcoswinicios.jobs.dto.CidadeDTO;
import com.marcoswinicios.jobs.entidades.Cidade;
import com.marcoswinicios.jobs.repository.CidadeRepository;

@Service
public class CidadeService{
	
	@Autowired
	private CidadeRepository repository;
	
	public List<CidadeDTO> findAlll(){
		List<Cidade> result = repository.findAll();
		return result
				.stream()
				.map(x -> new CidadeDTO(x)).collect(Collectors.toList());
	}


	public Page<CidadeDTO> findAll(org.springframework.data.domain.Pageable pageable) {
		Page<Cidade> result = repository.findAll(pageable);
		
		return result.map(x -> new CidadeDTO());
	}

	

	


}
