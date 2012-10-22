package org.mh.game.gf.enumbean;

public enum HANDCARD_TYPE
{
	LEOPARD("豹子",6), ROYALFLUSH("同花顺",5), FLUSH("同花",4), 
	STRAIGHT("顺子",3), PAIR("对子",2), SINGLE("散牌",1), ERROR("ERROR",0);
	
	private String desc;
	private int value;
	
	HANDCARD_TYPE(String desc, int value)
	{
		this.desc = desc;
		this.value = value;
	}
	
	public String getDesc()
	{
		return desc;
	}
	
	public int getValue()
	{
		return value;
	}
}
