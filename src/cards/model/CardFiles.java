package cards.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CardFiles
{
public static String[] getCards(String filePath)
{
	try
	{
		ArrayList<String> cards = new ArrayList<String>();
		List<String> lines = Files.readAllLines(Paths.get(filePath));
		for(String string : lines)
		{
			for(String innerString : string.split(" "))
			{
				cards.add(innerString.trim());
			}
		}
		return (String[]) cards.toArray();
	} catch (IOException e)
	{
		e.printStackTrace();
	}
	return null;
}
}