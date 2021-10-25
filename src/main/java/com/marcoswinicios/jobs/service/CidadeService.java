package com.marcoswinicios.jobs.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.marcoswinicios.jobs.dto.CidadeDTO;
import com.marcoswinicios.jobs.entidades.Cidade;
import com.marcoswinicios.jobs.repository.CidadeRepository;


@Service
public class CidadeService implements Services<CidadeDTO>{
	
	@Autowired
	private CidadeRepository repository;
	
	@Override
	public Page<CidadeDTO> findAll(Pageable pageable) {
		Page<Cidade> result = repository.findAll(pageable);
		return result.map(x -> new CidadeDTO(x));
	}

	@Override
	public CidadeDTO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Long findIdByName(List<Cidade> cidades, String nomeCidade) {
		for(Cidade c: cidades) {
			if(c.getNome().equalsIgnoreCase(nomeCidade)) {	
				return c.getId();
			}
		}
		return 0L;		
	}
}
