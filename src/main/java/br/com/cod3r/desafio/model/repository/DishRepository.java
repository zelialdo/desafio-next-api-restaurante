package br.com.cod3r.desafio.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.desafio.model.entities.Pratos;

public interface DishRepository extends PagingAndSortingRepository<Pratos, Integer>{

	public Iterable<Pratos> findByNomeContainingIgnoreCase(String parteNome);

	public Iterable<Pratos> findByCategoriaContainingIgnoreCase(String parteNome);
}


