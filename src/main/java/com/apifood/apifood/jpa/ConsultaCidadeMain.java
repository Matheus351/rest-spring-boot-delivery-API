package com.apifood.apifood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.apifood.apifood.ApifoodApplication;
import com.apifood.apifood.domain.model.Cidade;
import com.apifood.apifood.domain.repository.CidadeRepository;

public class ConsultaCidadeMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ApifoodApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		CidadeRepository  cidadeRepository = applicationContext.getBean(CidadeRepository.class);
		
		List<Cidade> cidades = cidadeRepository.listar();
		
		for (Cidade cidade: cidades) {
			System.out.printf("%s - %s \n",cidade.getNome(), cidade.getEstado().getNome());
		}
		
	}
}
