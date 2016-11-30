package com.magic.cube.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.magic.cube.model.Card;
import com.magic.cube.model.Cube;
import com.magic.cube.util.CardCreator;

@ApplicationScoped
@Stateful
public class CubeService {
	
	@Inject
	private EntityManager em;

	public List<Card> findCubeByName(String cubeName) {
		List<Card> returnList = new ArrayList<Card>();
		Card card = CardCreator.createOmenspeaker();
		returnList.add(card);
		return returnList;
	}

	public Cube createCube(String name) {
		Query query = em.createQuery("from Cube c where c.name = :name");
		query.setParameter("name", name);
		List<Cube> results = (List<Cube>) query.getResultList();
		if(results == null || results.isEmpty()){
			Cube cubeToAdd = new Cube();
			cubeToAdd.setName(name);
			em.persist(cubeToAdd);
			return cubeToAdd;
		} else {
			Cube cube = results.get(0);
			cube = hydrate(cube);
			return cube;
		}
		
	}
	
	public Cube addOmenspeaker(String cubeName){
		Cube cube = createCube(cubeName);
		Card omenspeaker = CardCreator.createOmenspeaker();
		em.persist(omenspeaker);
		cube.getCards().add(omenspeaker);
		em.persist(cube);
		return cube;
	}

	private Cube hydrate(Cube cube) {
		for(Card card:cube.getCards()){
			card.getTypes().size();
			card.getSubtype().size();
		}
		cube.getName();
		return cube;
	}

}
