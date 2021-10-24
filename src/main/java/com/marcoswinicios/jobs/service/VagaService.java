package com.marcoswinicios.jobs.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.marcoswinicios.jobs.dto.VagaDTO;
import com.marcoswinicios.jobs.entidades.Beneficio;
import com.marcoswinicios.jobs.entidades.Empresa;
import com.marcoswinicios.jobs.entidades.NivelExperiencia;
import com.marcoswinicios.jobs.entidades.Skill;
import com.marcoswinicios.jobs.entidades.TipoContrato;
import com.marcoswinicios.jobs.entidades.Vaga;
import com.marcoswinicios.jobs.repository.VagaRepository;

@Service
public class VagaService implements Services<VagaDTO> {
	
	@Autowired
	private VagaRepository repository;
	
	
	public boolean existsById(Long id) {
		return repository.existsById(id);
	}
	
	@Override
	public Page<VagaDTO> findAll(Pageable pageable) {
		Page<Vaga> result = repository.findAll(pageable);
		return result.map(x -> new VagaDTO(x));
	}

	public Page<VagaDTO> findBySkill( Long idSkill, Pageable pageable){
		System.out.println("ANTES DA CONSULTA");
	
		Page<Vaga> result = repository.findBySkill(idSkill, pageable);

		System.out.println("DEPOIS DA CONSULTA");

		return result.map(vaga -> new VagaDTO(vaga));
	}


public List<VagaDTO> listarTodas(){
	List<VagaDTO> vagas = new ArrayList<>();
	List<Skill> skills = new ArrayList<>();
	List<String> listAtividades = new ArrayList<>();
	List<String> listRequisitos = new ArrayList<>();
	List<Beneficio> beneficios =  new ArrayList<>();
	
	
	skills.add(new Skill(1L, "Java"));
	skills.add(new Skill(2L, "JPA"));
	skills.add(new Skill(3L, "MySQL"));
	skills.add(new Skill(4L, "Spring Boot"));
	
	listAtividades.add("Criar novas Funcionalidades");
	listAtividades.add("Resolver Bugs");
	listAtividades.add("Fazer levantamento de requisitos");
	
	listRequisitos.add("Conhecimento em Java");
	listRequisitos.add("Conhecimento em Bancos de dados Relacionais (MySQL)");
	listRequisitos.add("Conhecimento JPA");
	listRequisitos.add("Conhecimento em Spring Boot");
	
	beneficios.add(new Beneficio(1L, "Vale Refeição"));
	beneficios.add(new Beneficio(1L, "Vale Transporte"));
	beneficios.add(new Beneficio(1L, "Plano de Saúde"));
	beneficios.add(new Beneficio(1L, "Seguro de Vida"));
	
	String atividades =  new String();
	for(String str : listAtividades) {
		atividades += str + ";";
	}
	String requisitos =  new String();
	for(String str : listRequisitos) {
		requisitos +=  str + ";";
	}
	Vaga vaga = new Vaga(
			1L, 
			"Desenvolvedor Java",
			true, 
			true,
			TipoContrato.CLT,
			NivelExperiencia.JUNIOR,
			skills,
			atividades,
			requisitos,
			new BigDecimal("3000.00"),
			LocalDate.now(),
			true,
			beneficios
			);
	List<Skill> skills2 = new ArrayList<>();
	skills2.add(new Skill(5L, "HTML"));
	skills2.add(new Skill(6L, "CSS"));
	skills2.add(new Skill(7L, "Javascrip"));
	skills2.add(new Skill(8L, "React"));
	
	List<String> listAtividades2 = new ArrayList<>();
	
	listAtividades2.add("Desenvolver páginas Responsíveis");
	listAtividades2.add("Boas práticas de codificação");
	listAtividades2.add("Correção de erros em projetos existentes");
	
	List<String> listRequisitos2 = new ArrayList<>();
	
	listRequisitos2.add("Conhecimento em HTML Semântico");
	listRequisitos2.add("Conhecimento em React JS");
	listRequisitos2.add("Conhecimento em Animações");
	
	String atividades2 =  new String();
	for(String str : listAtividades) {
		atividades2 += str + ";";
	}
	String requisitos2 =  new String();
	for(String str : listRequisitos) {
		requisitos2 +=  str + ";";
	}
	
	Vaga vaga2 = new Vaga(
			2L, 
			"Desenvolvedor Front-end",
			true, 
			true,
			TipoContrato.CLT,
			NivelExperiencia.PLENO,
			skills2,
			atividades2,
			requisitos2,
			new BigDecimal("5000.00"),
			LocalDate.now(),
			true,
			beneficios
			);
	
	vagas.add(new VagaDTO(vaga));
	vagas.add(new VagaDTO(vaga2));
	return vagas;
	}


@Override
public VagaDTO findById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

}