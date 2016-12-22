package com.ondoor.commons.generics.dao;


import java.util.List;

/**
 * @param <E>
 * @param <K>
 */
public interface GenericDao<E, K> {

	public void add(E entity);

	public void saveOrUpdate(E entity);

	public void update(E entity);

	public void remove(E entity);

	public void removeById(K key);

	public E find(K key);

	public E findOne(K key);

	public List<E> getAll();
	

}
