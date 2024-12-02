package com.apifood.apifood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.apifood.apifood.ApifoodApplication;
import com.apifood.apifood.domain.model.FormaPagamento;
import com.apifood.apifood.domain.repository.FormaPagamentoRepository;

public class ConsultaFormaPagamentoMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ApifoodApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);
		
		
		List<FormaPagamento> formasPagamentos = formaPagamentoRepository.listar();
		
		for (FormaPagamento formaPagamento: formasPagamentos) {
			System.out.println(formaPagamento.getDescricao());
		}
		
		
		
		
		
	
		
	}
}
