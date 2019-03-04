package fr.vilment.test.pizzeria.service;

import java.util.List;

import fr.vilment.test.pizzeria.domain.Client;

public interface IClientService {

	public List<Client> getAllClient();
	public Client getOne(int id);
	public void deleteClient(int id);
	public void newClient(Client cl);
	public void modClient(Client cl);
	public List<Client> findAllByOrderByNom();
	public List<Client> findAllByOrderByNomDesc();
}
