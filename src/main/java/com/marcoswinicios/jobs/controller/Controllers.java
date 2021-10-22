package com.marcoswinicios.jobs.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


public interface Controllers<T> {
	@GetMapping
	public ResponseEntity<Page<T>> findAll(Pageable page);
}
