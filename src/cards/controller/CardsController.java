package cards.controller;

import cards.model.Card;
import cards.model.CardFiles;

public class CardsController
{
	private Card[] cards;
	public CardsController()
	{
		cards = null;
	}
	public void loadCards(String filePath)
	{
		String[] fronts = CardFiles.getCards(filePath);
		cards = new Card[fronts.length];
		for(int index = 0; index< cards.length; index++)
		{
			cards[index] = new Card(fronts[index],"");
		}
	}
	
}
