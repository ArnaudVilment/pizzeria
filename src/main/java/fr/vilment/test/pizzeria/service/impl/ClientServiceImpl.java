package fr.vilment.test.pizzeria.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.vilment.test.pizzeria.domain.Client;
import fr.vilment.test.pizzeria.domain.Pizza;
import fr.vilment.test.pizzeria.repository.IClientRepository;
import fr.vilment.test.pizzeria.service.IClientService;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	IClientRepository cR;

	@Override
	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		return cR.findAll();
	}

	@Override
	public Client getOne(int id) {
		// TODO Auto-generated method stub
		return cR.getOne(id);
	}

	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		cR.deleteById(id);
	}

	@Override
	public void newClient(Client cl) {
		// TODO Auto-generated method stub
		cR.save(cl);
	}

	@Override
	public void modClient(Client cl) {
		// TODO Auto-generated method stub
		cR.save(cl);
	}
	
	@Override
	public List<Client> findAllByOrderByNom() {
		// TODO Auto-generated method stub
		return cR.findAllByOrderByNom();
	}

	@Override
	public List<Client> findAllByOrderByNomDesc() {
		// TODO Auto-generated method stub
		return cR.findAllByOrderByNomDesc();
	}
}
