package br.com.paxtecnologia.backend.services;

import java.util.List;
import java.util.Optional;

public interface ServicesInterface<E> {

	public void save(final E entity);

	public Optional<E> findById(Integer id);

	public List<E> getAll();

	public E getOne(Integer id);

}