package cards.model;

public class Card
{
	private String front;
	private String back;
	private boolean frontDisplayed;
	public Card(String front, String back)
	{
		this.front = front;
		this.back  = back;
		this.frontDisplayed = true;
	}
	public void flip()
	{
		this.frontDisplayed = !frontDisplayed;
	}
	public String getText()
	{
		if(frontDisplayed)
		{
			return front;
		}
		else
		{
			return back;
		}
	}
}
