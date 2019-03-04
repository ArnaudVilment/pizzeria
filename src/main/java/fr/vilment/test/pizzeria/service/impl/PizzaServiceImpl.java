package fr.vilment.test.pizzeria.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.vilment.test.pizzeria.domain.Pizza;
import fr.vilment.test.pizzeria.repository.IPizzaRepository;
import fr.vilment.test.pizzeria.service.IPizzaService;

@Service
public class PizzaServiceImpl implements IPizzaService {

	@Autowired
	IPizzaRepository pR;
	
	@Override
	public List<Pizza> getAllPizza() {
		// TODO Auto-generated method stub
		return pR.findAll();
	}

	@Override
	public Pizza getOne(int id) {
		// TODO Auto-generated method stub
		return pR.getOne(id);
	}

	@Override
	public void deletePizza(int id) {
		// TODO Auto-generated method stub
		pR.deleteById(id);
	}

	@Override
	public void newPizza(Pizza pz) {
		// TODO Auto-generated method stub
		pR.save(pz);
	}

	@Override
	public void modPizza(Pizza pz) {
		// TODO Auto-generated method stub
		pR.save(pz);
	}

	@Override
	public List<Pizza> findAllByOrderByNom() {
		// TODO Auto-generated method stub
		return pR.findAllByOrderByLibelle();
	}

	@Override
	public List<Pizza> findAllByOrderByNomDesc() {
		// TODO Auto-generated method stub
		return pR.findAllByOrderByLibelleDesc();
	}
}
