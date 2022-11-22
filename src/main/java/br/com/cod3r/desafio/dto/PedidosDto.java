package br.com.cod3r.desafio.dto;

import java.time.LocalDate;

import br.com.cod3r.desafio.model.entities.Dish;
import br.com.cod3r.desafio.model.entities.Pedidos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidosDto {

	private int numeroDoPedido;
	private LocalDate dataDoPedido;
//	private double total;
	
	private Dish dish;
	
	public PedidosDto(Pedidos pedidos) {
		super();
		this.numeroDoPedido = pedidos.getNumeroDoPedido();
		this.dataDoPedido = pedidos.getDataDoPedido();
	//	this.total = pedidos.getTotal();
		this.dish = pedidos.getDish();
	}
	
	

	
	
}


