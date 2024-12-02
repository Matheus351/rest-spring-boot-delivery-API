package com.apifood.apifood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.apifood.apifood.ApifoodApplication;
import com.apifood.apifood.domain.model.Restaurante;
import com.apifood.apifood.domain.repository.RestauranteRepository;

public class ConsultaRestauranteMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ApifoodApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		RestauranteRepository  restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		List<Restaurante> restaurantes = restauranteRepository.listar();
		
		for (Restaurante restaurante: restaurantes) {
			System.out.printf("%s - %f - %s \n", restaurante.getNome(),
					restaurante.getTaxaFrete(), restaurante.getCozinha().getNome());
		}
		
	}
}
