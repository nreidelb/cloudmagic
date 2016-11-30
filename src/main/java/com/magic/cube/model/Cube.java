package com.magic.cube.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.SequenceGenerator;

@Entity
public class Cube {

	@SequenceGenerator(name="cube_seq_gen", sequenceName="cube_seq_gen")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cube_seq_gen")
	private
	BigInteger id;
	
	@ElementCollection
	@JoinTable(name="card_cube")
	@Enumerated(EnumType.STRING)
	private List<Card> cards;
	
	@Column
	private String name;
	
	public Cube(){
		this.setCards(new ArrayList<Card>()); 
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}
}
