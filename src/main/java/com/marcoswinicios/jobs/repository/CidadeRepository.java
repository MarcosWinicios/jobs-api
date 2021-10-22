package com.marcoswinicios.jobs.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoswinicios.jobs.entidades.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

	Page<Cidade> findAll(Pageable pageable);

}
