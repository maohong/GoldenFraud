package org.mh.game.gf.enumbean;

public enum HANDCARD_TYPE
{
	LEOPARD("����",6), ROYALFLUSH("ͬ��˳",5), FLUSH("ͬ��",4), 
	STRAIGHT("˳��",3), PAIR("����",2), SINGLE("ɢ��",1), ERROR("ERROR",0);
	
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
