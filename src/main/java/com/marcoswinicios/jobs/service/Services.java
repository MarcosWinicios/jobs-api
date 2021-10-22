package com.marcoswinicios.jobs.service;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;

public interface Services{
	public Page<Object> findAll(Pageable pageable);
}
