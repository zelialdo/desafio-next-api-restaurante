package br.com.cod3r.desafio.model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numeroDoPedido;
	private LocalDate dataDoPedido;
	//private double total;
	
	@ManyToOne 
	private Dish dish;
	
	
}
