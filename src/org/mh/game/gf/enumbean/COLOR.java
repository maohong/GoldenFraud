package org.mh.game.gf.enumbean;

public enum COLOR
{
	SPADE(4,"����"), HEART(3,"����"), CLUB(2,"�ݻ�"), DIAMOND(1,"��Ƭ");
	
	int value;
	String desc;
	COLOR(int value,String desc)
	{
		this.value = value;
		this.desc = desc;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getDesc()
	{
		return desc;
	}
	
	public static COLOR getByValue(int value)
	{
		if (value == COLOR.SPADE.value)
			return COLOR.SPADE;
		else if (value == COLOR.HEART.value)
			return COLOR.HEART;
		else if (value == COLOR.CLUB.value)
			return COLOR.CLUB;
		else 
			return COLOR.DIAMOND;
	}
}
