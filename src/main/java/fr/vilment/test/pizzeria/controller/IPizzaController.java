package fr.vilment.test.pizzeria.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import fr.vilment.test.pizzeria.domain.Pizza;

public interface IPizzaController {

	public String getAllPizza(Model model);
	public String getOne(Model model, @PathVariable int id);
	public String newPizza(Model model);
	public String ajouterPizza(Model model, @ModelAttribute Pizza pz);
	public String modifierPizza(Model model, @PathVariable int id);
	public String suprimerPizza(Model model, @PathVariable int id);
	public String getListPizzaTrierAsc(Model model);
	public String getListPizzaTrierDesc(Model model);
}
