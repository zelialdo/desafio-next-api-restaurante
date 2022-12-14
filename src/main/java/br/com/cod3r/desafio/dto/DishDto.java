package br.com.cod3r.desafio.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.cod3r.desafio.model.entities.Dish;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DishDto {

	private int id;
	private String nome;
	private String categoria;
	private String ingredientes;
	private double preco;
	
	public DishDto(Dish dish) {
		super();
		this.id = dish.getId();
		this.nome = dish.getNome();
		this.categoria = dish.getCategoria();
		this.ingredientes = dish.getIngredientes();
		this.preco = dish.getPreco();
		
	}
	
	public static List<DishDto> convert(List<Dish> dish){
		return dish.stream().map(DishDto::new).collect(Collectors.toList());
	}
}
