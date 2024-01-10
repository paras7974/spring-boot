package com.rays.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseDaoImpl<T extends BaseDto> implements BaseDaoInt<T> {

	@PersistenceContext
	public EntityManager entityManager;
	
	public abstract Class<T> getDTOClass();

	public long add(T dto) {

		entityManager.persist(dto);
		return dto.getId();
	}

	public void update(T dto) {
		System.out.println("iiiiiiiiiiiiddddddddddddddddd" + dto.getId());
		entityManager.merge(dto);
	}

	
	public void delete(T dto) {
		entityManager.remove(dto);
	
	}
	
	public T finByPk(long pk) {
		
	T dto =	entityManager.find(getDTOClass(), pk);
		
		return dto;
	}

}
