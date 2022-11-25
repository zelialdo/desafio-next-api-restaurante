package br.com.cod3r.desafio.model.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.desafio.model.entities.Dish;

public interface DishRepository extends PagingAndSortingRepository<Dish, Integer>{

	public List<Dish> findByNomeContainingIgnoreCase(String parteNome);

	public List<Dish> findByCategoriaContainingIgnoreCase(String parteNome);
}


