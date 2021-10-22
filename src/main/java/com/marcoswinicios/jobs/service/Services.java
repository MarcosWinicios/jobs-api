package com.marcoswinicios.jobs.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Services<T>{
	public Page<T> findAll(Pageable pageable);
}
