package com.marcoswinicios.jobs.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcoswinicios.jobs.entidades.Skill;
import com.marcoswinicios.jobs.repository.SkillRepository;

@Service
public class SkillsService {
	
	

	@Autowired
	private SkillRepository repository;
	
	public List<Skill> findAll(){
		List<Skill> result = repository.findAll();
		                                          
		return result
				.stream()
				.map(x -> new Skill(x.getId(), x.getNome()))
				.collect(Collectors.toList());
	}
}
