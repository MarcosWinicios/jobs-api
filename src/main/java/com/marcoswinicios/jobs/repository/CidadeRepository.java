package com.marcoswinicios.jobs.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoswinicios.jobs.entidades.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
