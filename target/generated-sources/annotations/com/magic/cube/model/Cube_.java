package com.magic.cube.model;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cube.class)
public abstract class Cube_ {

	public static volatile SingularAttribute<Cube, BigInteger> id;
	public static volatile SingularAttribute<Cube, String> name;
	public static volatile ListAttribute<Cube, Card> cards;

}

