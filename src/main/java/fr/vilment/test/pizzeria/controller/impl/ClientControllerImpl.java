package fr.vilment.test.pizzeria.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.vilment.test.pizzeria.controller.IClientController;
import fr.vilment.test.pizzeria.domain.Client;
import fr.vilment.test.pizzeria.service.IClientService;


@Controller
public class ClientControllerImpl implements IClientController {

	@Autowired
	IClientService pC;

	@Override
	@GetMapping(value = "/listClient")
	public String getAllClient(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("listClient", pC.getAllClient());
		return "listClient";
	}

	@Override
	@GetMapping(value = "/infoClient/{id}")
	public String getOne(Model model, int id) {
		// TODO Auto-generated method stub
		model.addAttribute("cli", pC.getOne(id));
		return "infoClient";
	}

	@Override
	@GetMapping(value = "/supClient/{id}")
	public String suprimerClient(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		pC.deleteClient(id);
		return "redirect:/listClient";
	}
	
	@Override
	@GetMapping(value = "/newClient")
	public String newClient(Model model) {
		// TODO Auto-generated method stub
		Client cl= new Client();
		model.addAttribute("cli", cl);
		return "newClient";
	}

	@Override
	@PostMapping(value = "/creerClient")
	public String ajouterClient(Model model, Client pz) {
		// TODO Auto-generated method stub
		pC.newClient(pz);
		return "redirect:/listClient";
	}

	@Override
	@GetMapping(value = "/modClient/{id}")
	public String modifierClient(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		model.addAttribute("cli", pC.getOne(id));
		return "newClient";
	}
	
	@GetMapping(value = "/triClientAsc")
	public String getListClientTrierAsc(Model model) {
		
		model.addAttribute("listClient", pC.findAllByOrderByNom());
		return "listClient";
	}
	
	@GetMapping(value = "/triClientDesc")
	public String getListClientTrierDesc(Model model) {
		
		model.addAttribute("listClient", pC.findAllByOrderByNomDesc());
		return "listClient";
	}
}
