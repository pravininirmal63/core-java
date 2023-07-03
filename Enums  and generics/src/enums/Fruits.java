package enums;

public enum Fruits {
	APPLE(200),MANGO(150);
	private int price;
	private Fruits(int price)
	{
		this.price=price;
	}
	@Override
	public String toString()
	{
		return this.price+" ";
	}
}
	
