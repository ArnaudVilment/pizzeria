package fr.vilment.test.pizzeria.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.vilment.test.pizzeria.domain.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer>{

	public ArrayList<Client> findAllByOrderByNom();
	public ArrayList<Client> findAllByOrderByNomDesc();
}
