package fr.vilment.test.pizzeria.service;

import java.util.List;

import fr.vilment.test.pizzeria.domain.Pizza;

public interface IPizzaService {

	public List<Pizza> getAllPizza();
	public Pizza getOne(int id);
	public void deletePizza(int id);
	public void newPizza(Pizza pz);
	public void modPizza(Pizza pz);
	public List<Pizza> findAllByOrderByNom();
	public List<Pizza> findAllByOrderByNomDesc();
	
}
