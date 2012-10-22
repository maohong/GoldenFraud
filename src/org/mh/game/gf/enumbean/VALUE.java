package org.mh.game.gf.enumbean;

public enum VALUE
{
	TWO(2,"2"), THREE(3,"3"), FOUR(4,"4"), FIVE(5,"5"), SIX(6,"6"),
	SEVEN(7,"7"), EIGHT(8,"8"), NINE(9,"9"), TEN(10,"10"), JACK(11,"J"),
	QUEEN(12,"Q"), KING(13,"K"), ACE(14,"A");
	
	int value;
	String desc;
	VALUE(int value, String desc)
	{
		this.value = value;
		this.desc = desc;
	}
	
	public int value()
	{
		return value;
	}
	
	public String desc()
	{
		return desc;
	}

	public static VALUE getByValue(int value)
	{
		if (value == VALUE.ACE.value)
			return VALUE.ACE;
		else if (value == VALUE.KING.value)
			return VALUE.KING;
		else if (value == VALUE.QUEEN.value)
			return VALUE.QUEEN;
		else if (value == VALUE.JACK.value)
			return VALUE.JACK;
		else if (value == VALUE.TEN.value)
			return VALUE.TEN;
		else if (value == VALUE.NINE.value)
			return VALUE.NINE;
		else if (value == VALUE.EIGHT.value)
			return VALUE.EIGHT;
		else if (value == VALUE.SEVEN.value)
			return VALUE.SEVEN;
		else if (value == VALUE.SIX.value)
			return VALUE.SIX;
		else if (value == VALUE.FIVE.value)
			return VALUE.FIVE;
		else if (value == VALUE.FOUR.value)
			return VALUE.FOUR;
		else if (value == VALUE.THREE.value)
			return VALUE.THREE;
		else
			return VALUE.TWO;
		
	}
}
