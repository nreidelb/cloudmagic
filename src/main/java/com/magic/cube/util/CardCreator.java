package com.magic.cube.util;

import java.util.ArrayList;

import com.magic.cube.model.Card;
import com.magic.cube.model.CardSubtype;
import com.magic.cube.model.CardType;

public class CardCreator {
	
	public static Card createOmenspeaker() {
		Card card = new Card();
		card.setName("Omenspeaker");
		card.setArtUrl("http://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=394394&type=card");
		card.setConvertedManaCost("1U");
		card.setPower(1);
		card.setToughness(3);
		card.setRulesText("When Omenspeaker enters the battlefield scry 2");
		ArrayList<CardType> types = new ArrayList<CardType>();
		types.add(CardType.CREATURE);
		card.setTypes(types);
		ArrayList<CardSubtype> subtypes = new ArrayList<CardSubtype>();
		subtypes.add(CardSubtype.HUMAN);
		subtypes.add(CardSubtype.WIZARD);
		card.setSubtype(subtypes);
		return card;
	}

}
