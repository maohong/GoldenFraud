package org.mh.game.gf.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.mh.game.gf.bean.HandCard;
import org.mh.game.gf.generator.CardPile;

public class Test
{
	public static void main(String[] args)
	{
		CardPile cardPile = CardPile.getInstance();
//		HandCard h1 = cardPile.getRandomHandCard();
//		HandCard h2 = cardPile.getRandomHandCard();
//		HandCard h3 = cardPile.getRandomHandCard();
//		HandCard h4 = cardPile.getRandomHandCard();
//		HandCard h5 = cardPile.getRandomHandCard();
//		HandCard h6 = cardPile.getRandomHandCard();
//		
		List<HandCard> cards = new ArrayList<HandCard>();
		for (int i=0; i<17; i++)
		{
			cards.add(cardPile.getRandomHandCard());
		}
		
		System.out.println("Unsorted: " + cards);
		Collections.sort(cards, new Comparator<HandCard>()
		{
			@Override
			public int compare(HandCard c1, HandCard c2)
			{
				if (c1.biggerThan(c2))
					return -1;
				else if (c1.smallerThan(c2))
					return 1;
				else 
					return 0;
			}
		});
		System.out.println("Sorted: " + cards);
	}
	
	
	
}
