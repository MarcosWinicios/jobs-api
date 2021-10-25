package com.marcoswinicios.jobs.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.marcoswinicios.jobs.entidades.Vaga;

public interface VagaRepository extends JpaRepository<Vaga, Long>{
	
	@Query(value = "select * from tb_vaga v "
			+ "inner join tb_vaga_skill vs "
			+ "on  v.id = vs.vaga_id "
			+ "inner join tb_skill s "
			+ "on s.id = vs.skill_id "
			+ "where vs.skill_id = :idSkill", nativeQuery = true)
	public Page<Vaga> findBySkill(Long idSkill, Pageable pageable);
	
	@Query(value = "select * from tb_vaga v "
			+ "inner join tb_empresa e "
			+ "on v.empresa_id = e.id "
			+ "inner join tb_cidade c "
			+ "on c.id = e.cidade_id "
			+ "where c.id = :idCidade", nativeQuery = true)
	public Page<Vaga> findByCidade(Pageable pageable, Long idCidade);
}
