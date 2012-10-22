package org.mh.game.gf.enumbean;

public enum COLOR
{
	SPADE(4,"∫⁄Ã“"), HEART(3,"∫ÏÃ“"), CLUB(2,"≤›ª®"), DIAMOND(1,"∑Ω∆¨");
	
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
