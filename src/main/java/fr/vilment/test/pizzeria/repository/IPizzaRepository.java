package fr.vilment.test.pizzeria.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.vilment.test.pizzeria.domain.Pizza;

@Repository
public interface IPizzaRepository extends JpaRepository<Pizza, Integer>{

	public ArrayList<Pizza> findAllByOrderByLibelle();
	public ArrayList<Pizza> findAllByOrderByLibelleDesc();
}
