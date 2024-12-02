package com.apifood.apifood.jpa;

import org.springframework.context.ApplicationContext;

import java.util.List;

import org.hibernate.stat.CacheableDataStatistics;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.apifood.apifood.ApifoodApplication;
import com.apifood.apifood.domain.model.Cozinha;
import com.apifood.apifood.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ApifoodApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		CozinhaRepository  cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		List<Cozinha> cozinhas = cozinhaRepository.listar();
		
		for (Cozinha cozinha: cozinhas) {
			System.out.println(cozinha.getNome());
		}
		
	}
}
