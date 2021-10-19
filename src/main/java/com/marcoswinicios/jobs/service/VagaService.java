package com.marcoswinicios.jobs.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.marcoswinicios.jobs.dto.VagaDTO;
import com.marcoswinicios.jobs.entidades.NivelExperiencia;
import com.marcoswinicios.jobs.entidades.Skill;
import com.marcoswinicios.jobs.entidades.TipoContrato;
import com.marcoswinicios.jobs.entidades.Vaga;

@Service
public class VagaService {
	
	
	public List<VagaDTO> listarTodas(){
		List<VagaDTO> vagas = new ArrayList<>();
		List<Skill> skills = new ArrayList<>();
		List<String> atividades = new ArrayList<>();
		List<String> requisitos = new ArrayList<>();
		
	
		skills.add(new Skill(1L, "Java"));
		skills.add(new Skill(2L, "JPA"));
		skills.add(new Skill(3L, "MySQL"));
		skills.add(new Skill(4L, "Spring Boot"));
		
		atividades.add("Criar novas Funcionalidades");
		atividades.add("Resolver Bugs");
		atividades.add("Fazer levantamento de requisitos");
		
		requisitos.add("Conhecimento em Java");
		requisitos.add("Conhecimento em Bancos de dados Relacionais (MySQL)");
		requisitos.add("Conhecimento JPA");
		requisitos.add("Conhecimento em Spring Boot");
		
		Vaga vaga = new Vaga(
				1L, 
				"Desenvolvedor Java",
				true, 
				true,
				"Buscamos pessoas responsáveis, que estão em busca de crescimento",
				TipoContrato.CLT,
				NivelExperiencia.JUNIOR,
				skills,
				atividades,
				requisitos,
				new BigDecimal("3000.00"),
				LocalDate.now(),
				true				
		);
		List<Skill> skills2 = new ArrayList<>();
		skills2.add(new Skill(5L, "HTML"));
		skills2.add(new Skill(6L, "CSS"));
		skills2.add(new Skill(7L, "Javascrip"));
		skills2.add(new Skill(8L, "React"));
		
		List<String> atividades2 = new ArrayList<>();
		
		atividades2.add("Desenvolver páginas Responsíveis");
		atividades2.add("Boas práticas de codificação");
		atividades2.add("Correção de erros em projetos existentes");
		
		List<String> requisitos2 = new ArrayList<>();
		
		requisitos2.add("Conhecimento em HTML Semântico");
		requisitos2.add("Conhecimento em React JS");
		requisitos2.add("Conhecimento em Animações");
		
		
		Vaga vaga2 = new Vaga(
				2L, 
				"Desenvolvedor Front-end",
				true, 
				true,
				"Buscamos pessoas criativas deticadas e inovadoras",
				TipoContrato.CLT,
				NivelExperiencia.PLENO,
				skills2,
				atividades2,
				requisitos2,
				new BigDecimal("5000.00"),
				LocalDate.now(),
				true				
		);
		
		vagas.add(new VagaDTO(vaga));
		vagas.add(new VagaDTO(vaga2));
		return vagas;
	}
}
