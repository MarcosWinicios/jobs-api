package com.marcoswinicios.jobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcoswinicios.jobs.entidades.Skill;
import com.marcoswinicios.jobs.service.SkillsService;


@RestController
@RequestMapping(value = "/skills")
public class SkillController{
	@Autowired
	private SkillsService service;
	
	@GetMapping
	public ResponseEntity<List<Skill>> findAll() {
		List<Skill> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
}
