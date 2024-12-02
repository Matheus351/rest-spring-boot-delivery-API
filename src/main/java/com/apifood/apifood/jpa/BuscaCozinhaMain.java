package com.apifood.apifood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.apifood.apifood.ApifoodApplication;
import com.apifood.apifood.domain.model.Cozinha;
import com.apifood.apifood.domain.repository.CozinhaRepository;

public class BuscaCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ApifoodApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		CozinhaRepository  cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = cadastroCozinha.buscar(1L);
		System.out.println(cozinha.getNome());
	}
}
