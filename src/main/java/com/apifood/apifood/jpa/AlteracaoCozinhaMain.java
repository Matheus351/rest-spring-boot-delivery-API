package com.apifood.apifood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.apifood.apifood.ApifoodApplication;
import com.apifood.apifood.domain.model.Cozinha;
import com.apifood.apifood.domain.repository.CozinhaRepository;

public class AlteracaoCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ApifoodApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		CozinhaRepository cozinhaRepository= applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		cozinha.setNome("Brasileira");
		
		// Se a cozinha com id 1 já existir, ele só atualiza. Essa é uma maneira de fazer update.
		cozinhaRepository.salvar(cozinha);
		
		
	}
}
