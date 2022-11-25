package br.com.cod3r.desafio.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.desafio.model.entities.Pedidos;
import br.com.cod3r.desafio.model.repository.DishRepository;
import br.com.cod3r.desafio.model.repository.PedidosRepository;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {
	
	@Autowired
	private PedidosRepository pedidosRepository;
	
	@Autowired
	private DishRepository dishRepository;

	@GetMapping
	public Iterable<Pedidos> Listar(){
		return pedidosRepository.findAll();
	}
	

	@PostMapping
	public Pedidos cadastrar(@RequestBody Pedidos obj) {
		obj.setData(LocalDate.now());
		return pedidosRepository.save(obj);
	}
	
	@PostMapping("/{nome}/{idPedido}")
	public ResponseEntity<?> adicionarPrato(@PathVariable  String nome,@PathVariable Integer idPedido) {
		var dishs = dishRepository.findByNomeContainingIgnoreCase(nome);
		if(dishs.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		var pedidos = pedidosRepository.findById(idPedido).get();
		pedidos.getDish().addAll(dishs);
		var result = pedidosRepository.save(pedidos);
		return ResponseEntity.ok(result);
	}
	
	
}
