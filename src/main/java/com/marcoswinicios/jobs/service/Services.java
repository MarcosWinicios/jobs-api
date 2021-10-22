package com.marcoswinicios.jobs.service;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;

public interface Services<T>{
	public Page<T> findAll(Pageable pageable);
}
