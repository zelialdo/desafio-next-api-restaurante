package br.com.cod3r.desafio.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.desafio.model.entities.Pedidos;

public interface PedidosRepository extends PagingAndSortingRepository<Pedidos, Integer>{
	
	public Iterable<Pedidos> findByNomeContainingIgnoreCase(String parteNome);

	public Iterable<Pedidos> findByCategoriaContainingIgnoreCase(String parteNome);
	
	

}
