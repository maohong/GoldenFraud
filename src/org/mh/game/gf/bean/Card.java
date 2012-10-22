package org.mh.game.gf.bean;

import org.mh.game.gf.enumbean.COLOR;
import org.mh.game.gf.enumbean.VALUE;

public class Card
{
	private COLOR color;
	private VALUE value;
	
	public COLOR getColor()
	{
		return color;
	}
	public void setColor(COLOR color)
	{
		this.color = color;
	}
	public VALUE getValue()
	{
		return value;
	}
	public void setValue(VALUE value)
	{
		this.value = value;
	}
	
	public boolean biggerThan(Card c)
	{
		return this.value.value() > c.value.value();
//		if (this.getValue().value() > c.getValue().value())
//			return true;
//		else if (this.getValue().value() < c.getValue().value())
//			return false;
//		else	//大小相同比花色
//		{
//			if (this.getColor().getValue() > c.getColor().getValue())
//				return true;
//			else if (this.getColor().getValue() < c.getColor().getValue())
//				return false;
//			else
//			{
//				System.err.println("WARN: comparing with itself?!! Result: equal");
//				return false;
//			}
//		}
	}
	
	public boolean smallerThan(Card c)
	{
		return this.value.value() < c.value.value();
//		if (this.getValue().value() < c.getValue().value())
//			return true;
//		else if (this.getValue().value() > c.getValue().value())
//			return false;
//		else	//大小相同比花色
//		{
//			if (this.getColor().getValue() < c.getColor().getValue())
//				return true;
//			else if (this.getColor().getValue() > c.getColor().getValue())
//				return false;
//			else
//			{
//				System.err.println("WARN: comparing with itself?!! Result: equal");
//				return false;
//			}
//		}
	}
	
	@Override
	public String toString()
	{
		return this.getColor().getDesc() + this.getValue().desc();
		 
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Card))
			return false;
		
		Card c = (Card)o;
		return this.value.value() == c.value.value()
				&& this.color.getValue() == c.color.getValue();
	}
	
}

