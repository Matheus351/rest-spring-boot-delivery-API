package com.apifood.apifood.domain.repository;

import java.util.List;
import com.apifood.apifood.domain.model.Permissao;

public interface PermissaoRepository {
	List<Permissao> listar();
	Permissao buscar(Long id);
	Permissao salvar(Permissao permissao);
	void remover(Permissao permissao);
}
