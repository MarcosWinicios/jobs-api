package com.marcoswinicios.jobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoswinicios.jobs.entidades.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
