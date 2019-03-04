package fr.vilment.test.pizzeria.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.vilment.test.pizzeria.controller.IPizzaController;
import fr.vilment.test.pizzeria.domain.Pizza;
import fr.vilment.test.pizzeria.service.IPizzaService;

@Controller
public class PizzaControllerImpl implements IPizzaController {

	@Autowired
	IPizzaService pS;
	
	@Override
	@GetMapping(value = "/listPizza")
	public String getAllPizza(Model model) {
		
		model.addAttribute("listPizza", pS.getAllPizza());
		return "/listPizza";
	}

	@Override
	@GetMapping(value = "/infoPizza/{id}")
	public String getOne(Model model, int id) {
		// TODO Auto-generated method stub
		model.addAttribute("piz", pS.getOne(id));
		return "infoPizza";
	}
	
	@Override
	@GetMapping(value = "/supPizza/{id}")
	public String suprimerPizza(Model model, @PathVariable int id) {
		
		pS.deletePizza(id);
		return "redirect:/listPizza";
	}
	
	@GetMapping(value = "/newPizza")
	public String newPizza(Model model) {
		
		Pizza pz = new Pizza();
		model.addAttribute("piz", pz);
		return "newPizza";
	}
	
	@PostMapping(value = "/creerPizza")
    public String ajouterPizza(Model model, @ModelAttribute Pizza pz) {

		pS.newPizza(pz);

        return "redirect:/listPizza";
    }
	
	@GetMapping(value = "/modPizza/{id}")
    public String modifierPizza(Model model, @PathVariable int id) {

		model.addAttribute("piz", pS.getOne(id));

        return "newPizza";
    }
	
	@GetMapping(value = "/triPizzaAsc")
	public String getListPizzaTrierAsc(Model model) {
		
		model.addAttribute("listPizza", pS.findAllByOrderByNom());
		return "listPizza";
	}
	
	@GetMapping(value = "/triPizzaDesc")
	public String getListPizzaTrierDesc(Model model) {
		
		model.addAttribute("listPizza", pS.findAllByOrderByNomDesc());
		return "listPizza";
	}
}
