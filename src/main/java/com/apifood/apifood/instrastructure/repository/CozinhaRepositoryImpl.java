package com.apifood.apifood.instrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.apifood.apifood.domain.model.Cozinha;
import com.apifood.apifood.domain.repository.CozinhaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {

	 @PersistenceContext
	 private EntityManager manager;
	
	 public List<Cozinha> listar(){
		 
		 TypedQuery<Cozinha> query =  manager.createQuery("from Cozinha", Cozinha.class);
		 return query.getResultList(); 
		 
	 }
	 
	 @Override
	 public Cozinha buscar(Long id) {
		 return manager.find(Cozinha.class, id);
	 }
	 
	 @Override
	 @Transactional
	 public Cozinha salvar(Cozinha cozinha) {
		 return manager.merge(cozinha);
	 }
	 
	 @Override
	 @Transactional
	 public void remover(Cozinha cozinha) {
		 cozinha = buscar(cozinha.getId());
		 manager.remove(cozinha);
	 }
	 
	
}
