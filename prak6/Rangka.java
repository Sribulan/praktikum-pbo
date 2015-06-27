package prak6;

import prak6.Rangka.Ban;

public class Rangka {
	
	private Ban ban;
	
	public Rangka()
	{
		ban = new Ban();
		System.out.println("Konstruktor Rangka");
	}
	
class Ban
{
	public Ban()
	{
		System.out.println("Konstruktor Ban");
	}
}

}
