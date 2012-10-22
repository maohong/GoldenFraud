package org.mh.game.gf.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.mh.game.gf.enumbean.HANDCARD_TYPE;
import org.mh.game.gf.tool.HandCardTypeCalculator;

public class HandCard
{
	private List<Card> cards = new ArrayList<Card>();
	
	public void sort()
	{
		Collections.sort(cards, new Comparator<Card>()
		{
			// sort by card value desc
			@Override
			public int compare(Card c1, Card c2)
			{
				if (c1.biggerThan(c2))
					return -1;
				else if (c1.smallerThan(c2))
					return 1;
				else 
					return 0;
			}
			
		});
	}

	public void addCard(Card card)
	{
		if (this.cards.size() == 3)
		{
			System.err.println("Already got three cards!!!");
			return;
		}
		
		this.cards.add(card);
		sort();
	}
	
	public boolean biggerThan(HandCard card)
	{
		HANDCARD_TYPE thisWeight = HandCardTypeCalculator.getHandCardType(this);
		HANDCARD_TYPE cardWeight = HandCardTypeCalculator.getHandCardType(card);
		
		if (thisWeight.getValue() > cardWeight.getValue())
			return true;
		else if (thisWeight.getValue() < cardWeight.getValue())
			return false;
		else
		{	// 同牌型
			Card t1 = this.cards.get(0);
			Card t2 = this.cards.get(1);
			Card t3 = this.cards.get(2);
			Card c1 = card.getCards().get(0);
			Card c2 = card.getCards().get(1);
			Card c3 = card.getCards().get(2);
			
			if (t1.biggerThan(c1))
				return true;
			else if (t1.smallerThan(c1))
				return false;
			else 
			{
				if (t2.biggerThan(c2))
					return true;
				else if (t2.smallerThan(c2))
					return false;
				else
				{
					if (t3.biggerThan(c3))
						return true;
					else if (t3.smallerThan(c3))
						return false;
					else
					{	// 牌型相同，三张牌大小相同，比花色
						if (t1.getColor().getValue() > c1.getColor().getValue())
								return true;
						else if (t1.getColor().getValue() < c1.getColor().getValue())
							return false;
						else
						{
							if (t2.getColor().getValue() > c2.getColor().getValue())
								return true;
							else if (t2.getColor().getValue() < c2.getColor().getValue())
								return false;
							else
							{
								if (t3.getColor().getValue() > c3.getColor().getValue())
									return true;
								else if (t3.getColor().getValue() < c3.getColor().getValue())
									return false;
								else
								{
									System.err.println("WARN: comparing with itself?!! Result: equal");
									return false;
								}
							}
						}
						
					}
				}
			}
		}
	}
	
	public boolean smallerThan(HandCard card)
	{
		HANDCARD_TYPE thisWeight = HandCardTypeCalculator.getHandCardType(this);
		HANDCARD_TYPE cardWeight = HandCardTypeCalculator.getHandCardType(card);
		
		if (thisWeight.getValue() < cardWeight.getValue())
			return true;
		else if (thisWeight.getValue() > cardWeight.getValue())
			return false;
		else
		{	// 同牌型
			Card t1 = this.cards.get(0);
			Card t2 = this.cards.get(1);
			Card t3 = this.cards.get(2);
			Card c1 = card.getCards().get(0);
			Card c2 = card.getCards().get(1);
			Card c3 = card.getCards().get(2);
			
			if (t1.biggerThan(c1))
				return false;
			else if (t1.smallerThan(c1))
				return true;
			else 
			{
				if (t2.biggerThan(c2))
					return false;
				else if (t2.smallerThan(c2))
					return true;
				else
				{
					if (t3.biggerThan(c3))
						return false;
					else if (t3.smallerThan(c3))
						return true;
					else
					{	// 牌型相同，三张牌大小相同，比花色
						if (t1.getColor().getValue() < c1.getColor().getValue())
								return true;
						else if (t1.getColor().getValue() > c1.getColor().getValue())
							return false;
						else
						{
							if (t2.getColor().getValue() < c2.getColor().getValue())
								return true;
							else if (t2.getColor().getValue() > c2.getColor().getValue())
								return false;
							else
							{
								if (t3.getColor().getValue() < c3.getColor().getValue())
									return true;
								else if (t3.getColor().getValue() > c3.getColor().getValue())
									return false;
								else
								{
									System.err.println("WARN: comparing with itself?!! Result: equal");
									return false;
								}
							}
						}
						
					}
				}
			}
		}
	}
	
	public List<Card> getCards()
	{
		return cards;
	}

	public String toString()
	{
		return this.cards.toString();
	}
	
	public boolean isUnavailable()
	{
		return this.cards.size() < 3;
	}
}
