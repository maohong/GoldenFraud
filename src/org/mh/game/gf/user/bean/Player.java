package org.mh.game.gf.user.bean;

import org.mh.game.gf.bean.HandCard;

/**
 * Player
 * @author maohong
 * 
 * 2012-10-22  ÏÂÎç10:10:43  maohong.tech@gmail.com
 */
public class Player
{
	private int id;
	private String name;
	private int balance;
	private HandCard handCard;
	
	
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public HandCard getHandCard()
	{
		return handCard;
	}
	public void setHandCard(HandCard handCard)
	{
		this.handCard = handCard;
	}
	
	
}
