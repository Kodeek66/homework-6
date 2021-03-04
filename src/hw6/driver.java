package hw6;

import java.net.URL;
import java.util.Scanner;

public class driver 
{
    public static void main(String[] args)
    { 
        HearthstoneCard c1 = new HearthstoneCard("Armor Vendor", 1, 1, 3);
        HearthstoneCard c2 = new HearthstoneCard("Wandmaker", 2, 2, 2);
        c1.display();
        c2.display();

        c1.setName("woot");
        c1.display();

        String cardJson = driver.getJSON("https://api.hearthstonejson.com/v1/25770/enUS/cards.json");
        System.out.println(cardJson);
    }
    static String getJSON(String urlString)
    {
        String line = "";
        try
        {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext())
            {
                line += input.nextLine();
            }
            input.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            line = "Error With Connection";
        }
        return line;
    }
}