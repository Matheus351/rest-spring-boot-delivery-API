package com.apifood.apifood.domain.repository;

import java.util.List;

import com.apifood.apifood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {
	List<FormaPagamento> listar();
	FormaPagamento buscar(Long id);
	FormaPagamento salvar(FormaPagamento formaPagamento);
	void remover(FormaPagamento formaPagamento);
}
