package br.com.cod3r.desafio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.desafio.model.repository.PedidosRepository;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {
	
	@Autowired
	private PedidosRepository pedidosRepository;
	
	
}
