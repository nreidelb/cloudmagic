package com.magic.cube.model;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Card.class)
public abstract class Card_ {

	public static volatile SingularAttribute<Card, BigInteger> id;
	public static volatile SingularAttribute<Card, String> convertedManaCost;
	public static volatile SingularAttribute<Card, String> artUrl;
	public static volatile SingularAttribute<Card, String> name;
	public static volatile ListAttribute<Card, CardSubtype> subtype;
	public static volatile SingularAttribute<Card, Integer> power;
	public static volatile SingularAttribute<Card, Integer> toughness;
	public static volatile SingularAttribute<Card, String> rulesText;
	public static volatile ListAttribute<Card, CardType> types;

}

