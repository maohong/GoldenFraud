package org.mh.game.gf.tool;

import java.util.List;

import org.mh.game.gf.bean.Card;
import org.mh.game.gf.bean.HandCard;
import org.mh.game.gf.enumbean.HANDCARD_TYPE;

public class HandCardTypeCalculator
{
	public static HANDCARD_TYPE getHandCardType(HandCard handCard)
	{
		if (handCard.isUnavailable())
			return HANDCARD_TYPE.ERROR;
		
		// sorted: a > b > c
		List<Card> cards = handCard.getCards();
		Card a = cards.get(0);
		Card b = cards.get(1);
		Card c = cards.get(2);

		if (a.getValue().value() == b.getValue().value()
				&& a.getValue().value() == c.getValue().value())
		{
			// 豹子
			System.out.println("handCard " + handCard + " : " + HANDCARD_TYPE.LEOPARD.getDesc());
			return HANDCARD_TYPE.LEOPARD;
		}
		else if (a.getColor().getValue() == b.getColor().getValue()
				&& a.getColor().getValue() == c.getColor().getValue())
		{
			// 同花顺
			if (a.getValue().value() == b.getValue().value() + 1 
					&& b.getValue().value() == c.getValue().value() + 1)
			{
				System.out.println("handCard " + handCard + " : " + HANDCARD_TYPE.ROYALFLUSH.getDesc());
				return HANDCARD_TYPE.ROYALFLUSH;
			}
			else	// 同花
			{
				System.out.println("handCard " + handCard + " : " + HANDCARD_TYPE.FLUSH.getDesc());
				return HANDCARD_TYPE.FLUSH;
			}
		}
		else if (a.getValue().value() == b.getValue().value() + 1 
					&& b.getValue().value() == c.getValue().value() + 1)
		{	// 顺子
			System.out.println("handCard " + handCard + " : " + HANDCARD_TYPE.STRAIGHT.getDesc());
			return HANDCARD_TYPE.STRAIGHT;
		}
		else if (a.getValue().value() == b.getValue().value() 
					|| a.getValue().value() == c.getValue().value()
					|| b.getValue().value() == c.getValue().value())
		{	// 对子
			System.out.println("handCard " + handCard + " : " + HANDCARD_TYPE.PAIR.getDesc());
			return HANDCARD_TYPE.PAIR;
		}
		else
		{	// 散牌
			System.out.println("handCard " + handCard + " : " + HANDCARD_TYPE.SINGLE.getDesc());
			return HANDCARD_TYPE.SINGLE;
		}
		
	}
}
