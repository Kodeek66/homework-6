package hw6;

public class HearthstoneCard 
{
	private int cost;
	private int attack;
	private int defense;
	private String name;
	
	public HearthstoneCard(String name, int cost, int attack, int defense)
	{
		this.cost = cost;
		this.attack = attack;
		this.defense = defense;
		this.name = name;
	}
	
	public int getCost()
	{
		return this.cost;
	}
	
	public void setName(String name)
	{
		if(name.length() >= 5)
		{
			this.name = name;
		}
	}
	
	void display()
	{
		System.out.format("Name: %s \nCost: %d \nAttack: %d Defense: %d\n", this.name, this.cost, this.attack,this.defense);
	}
}