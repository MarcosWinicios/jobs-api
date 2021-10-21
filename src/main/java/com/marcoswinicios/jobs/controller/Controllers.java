package com.marcoswinicios.jobs.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


public interface Controllers<T> {
	@GetMapping
	public ResponseEntity<List<T>> findAll();
}
