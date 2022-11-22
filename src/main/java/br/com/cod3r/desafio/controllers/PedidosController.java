package br.com.cod3r.desafio.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.desafio.model.entities.Dish;
import br.com.cod3r.desafio.model.entities.Pedidos;
import br.com.cod3r.desafio.model.repository.PedidosRepository;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {
	
	@Autowired
	private PedidosRepository pedidosRepository;
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Pedidos savePedidos(@Valid Dish dish, @Valid Pedidos pedidos) {
		pedidosRepository.save(pedidos);
		return pedidos;
	}

	
}
