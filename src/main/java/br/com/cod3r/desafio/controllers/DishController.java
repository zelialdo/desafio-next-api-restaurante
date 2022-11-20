package br.com.cod3r.desafio.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.desafio.model.entities.Dish;
import br.com.cod3r.desafio.model.repository.DishRepository;

@RestController
@RequestMapping("/api/dish")
public class DishController {
	
	@Autowired
	private DishRepository dishRepository;
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Dish savedish(@Valid Dish dish) {
		dishRepository.save(dish);
		return dish;
	}
	
	@GetMapping
	public Iterable<Dish> getDish(){
		return dishRepository.findAll();
	}
	
	@GetMapping(path = "/category/{category}")
	public Iterable<Dish> getDishByCategory(@PathVariable String category){
		return dishRepository.findByCategoriaContainingIgnoreCase(category);
	}
	
}
