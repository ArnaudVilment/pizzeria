package fr.vilment.test.pizzeria.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import fr.vilment.test.pizzeria.domain.Client;

public interface IClientController {

	public String getAllClient(Model model);
	public String getOne(Model model, @PathVariable int id);
	public String newClient(Model model);
	public String ajouterClient(Model model, @ModelAttribute Client pz);
	public String modifierClient(Model model, @PathVariable int id);
	public String suprimerClient(Model model, @PathVariable int id);
	public String getListClientTrierAsc(Model model);
	public String getListClientTrierDesc(Model model);
}
