package br.com.cod3r.desafio.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Dish {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String categoria;
	private String ingredientes;
	private double preco;

	public Dish() {
		
	}

	public Dish(String nome, String categoria, String ingredientes, double preco) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.ingredientes = ingredientes;
		this.preco = preco;
	}
	
}
