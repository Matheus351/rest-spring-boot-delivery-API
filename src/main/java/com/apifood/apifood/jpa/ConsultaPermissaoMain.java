package com.apifood.apifood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.apifood.apifood.ApifoodApplication;
import com.apifood.apifood.domain.model.Permissao;
import com.apifood.apifood.domain.repository.PermissaoRepository;

public class ConsultaPermissaoMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ApifoodApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		PermissaoRepository  permissaoRepository = applicationContext.getBean(PermissaoRepository.class);
		
		List<Permissao> permissoes = permissaoRepository.listar();
		
		for (Permissao permissao: permissoes) {
			System.out.printf("%s - %s \n",permissao.getNome(), permissao.getDescricao());
		}
		
	}
}	
