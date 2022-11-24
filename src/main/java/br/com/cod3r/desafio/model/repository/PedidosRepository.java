package br.com.cod3r.desafio.model.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.desafio.model.entities.Dish;
import br.com.cod3r.desafio.model.entities.Pedidos;

public interface PedidosRepository extends PagingAndSortingRepository<Pedidos, Integer>{

	void save(Optional<Dish> pedidos);

	
}
