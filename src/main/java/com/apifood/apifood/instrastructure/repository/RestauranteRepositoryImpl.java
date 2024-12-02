package com.apifood.apifood.instrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.apifood.apifood.domain.model.Restaurante;
import com.apifood.apifood.domain.repository.RestauranteRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {
	 @PersistenceContext
	 private EntityManager manager;
	
	 public List<Restaurante> listar(){
		 
		 TypedQuery<Restaurante> query =  manager.createQuery("from Restaurante", Restaurante.class);
		 return query.getResultList(); 
		 
	 }
	 
	 @Override
	 public Restaurante buscar(Long id) {
		 return manager.find(Restaurante.class, id);
	 }
	 
	 @Override
	 @Transactional
	 public Restaurante salvar(Restaurante restaurante) {
		 return manager.merge(restaurante);
	 }
	 
	 @Override
	 @Transactional
	 public void remover(Restaurante restaurante){
		 restaurante = buscar(restaurante.getId());
		 manager.remove(restaurante);
	 }
	 
}
