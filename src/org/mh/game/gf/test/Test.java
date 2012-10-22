package org.mh.game.gf.test;

import org.mh.game.gf.bean.HandCard;
import org.mh.game.gf.generator.CardPile;

public class Test
{
	public static void main(String[] args)
	{
		CardPile cardPile = CardPile.getInstance();
		HandCard h1 = cardPile.getRandomHandCard();
		HandCard h2 = cardPile.getRandomHandCard();
		
		if (h1.biggerThan(h2))
			System.out.println(h1 + " 大过 " + h2);
		else
			System.out.println(h2 + " 大过 " + h1);
	}
	
	
	
}
