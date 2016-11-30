package com.magic.cube.model;

import java.io.Serializable;
import java.math.BigInteger;
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
public class Card implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6039846295445383135L;
	
	@SequenceGenerator(name="card_seq_gen", sequenceName="card_seq")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="card_seq_gen")
	BigInteger id;

	@ElementCollection
	@JoinTable(name="card_type")
	@Enumerated(EnumType.STRING)
	private List<CardType> types;
	
	@ElementCollection
	@JoinTable(name="card_subtype")
	@Enumerated(EnumType.STRING)
	private List<CardSubtype> subtype;
	
	@Column
	private String name;
	
	@Column
	private String rulesText;
	
	@Column
	private String convertedManaCost;
	
	@Column
	private Integer power;
	
	@Column
	private Integer toughness;
	
	@Column
	private String artUrl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRulesText() {
		return rulesText;
	}

	public void setRulesText(String rulesText) {
		this.rulesText = rulesText;
	}

	public String getConvertedManaCost() {
		return convertedManaCost;
	}

	public void setConvertedManaCost(String convertedManaCost) {
		this.convertedManaCost = convertedManaCost;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Integer getToughness() {
		return toughness;
	}

	public void setToughness(Integer toughness) {
		this.toughness = toughness;
	}

	public String getArtUrl() {
		return artUrl;
	}

	public void setArtUrl(String artUrl) {
		this.artUrl = artUrl;
	}

	public List<CardType> getTypes() {
		return types;
	}

	public void setTypes(List<CardType> types) {
		this.types = types;
	}

	public List<CardSubtype> getSubtype() {
		return subtype;
	}

	public void setSubtype(List<CardSubtype> subtype) {
		this.subtype = subtype;
	}
	
}
