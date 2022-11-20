package br.com.cod3r.desafio.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.desafio.model.entities.Dish;

public interface DishRepository extends PagingAndSortingRepository<Dish, Integer>{

	public Iterable<Dish> findByNomeContainingIgnoreCase(String parteNome);

	public Iterable<Dish> findByCategoriaContainingIgnoreCase(String parteNome);
}


