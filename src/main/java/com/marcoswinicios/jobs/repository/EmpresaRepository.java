package com.marcoswinicios.jobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.marcoswinicios.jobs.entidades.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	@Query(value = "select * from tb_empresa e "
			+ "inner join tb_vaga v "
			+ "on e.id  = v.empresa_id "
			+ "where v.id = :idVaga", nativeQuery = true)
	public Empresa findByVaga(Long idVaga);
}
