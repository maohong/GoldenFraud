package org.mh.game.gf.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.mh.game.gf.bean.Card;
import org.mh.game.gf.bean.HandCard;
import org.mh.game.gf.enumbean.COLOR;
import org.mh.game.gf.enumbean.VALUE;

public class CardPile
{
	private static Map<Card, Boolean> sendFlag = new HashMap<Card, Boolean>();
	private static List<Card> cards = new ArrayList<Card>();
	private static CardPile cardPile = null;
	
	private CardPile()
	{
	}
	
	public static CardPile getInstance()
	{
		if (cardPile == null)
		{
			cardPile = new CardPile();
			generateRandomCardPile();
		}
			
		return cardPile;
	}
	
	private static List<Card> generateRandomCardPile()
	{
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<13; j++)
			{
				Card c = new Card();
				c.setColor(COLOR.getByValue(i));
				c.setValue(VALUE.getByValue(j));
				cards.add(c);
				sendFlag.put(c, false);
			}
		}
		Collections.shuffle(cards, new Random(System.currentTimeMillis()));
		System.out.println("Card pile: " + cards);
		return cards;
	}
	
	public HandCard getRandomHandCard()
	{
		HandCard handCard = new HandCard();
		int index = new Random().nextInt(cards.size());
		Card c1 = cards.get(index);
		while (sendFlag.get(c1).booleanValue() == true)
		{
			index = new Random().nextInt(cards.size());
			c1 = cards.get(index);
		}
		sendFlag.put(c1, true);
		handCard.addCard(c1);
		
		index = new Random().nextInt(cards.size()); 
		Card c2 = cards.get(index);
		while (sendFlag.get(c2).booleanValue() == true)
		{
			index = new Random().nextInt(cards.size());
			c2 = cards.get(index);
		}
		sendFlag.put(c2, true);
		handCard.addCard(c2);
		
		index = new Random().nextInt(cards.size()); 
		Card c3 = cards.get(index);
		while (sendFlag.get(c3).booleanValue() == true)
		{
			index = new Random().nextInt(cards.size());
			c3 = cards.get(index);
		}
		sendFlag.put(c3, true);
		handCard.addCard(c3);
		
		System.out.println("Get handcard: " + handCard);
		return handCard;
	}
}
