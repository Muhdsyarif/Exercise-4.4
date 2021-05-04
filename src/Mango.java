
public class Mango extends Fruits{
	
	private String colour, taste;
	private double price;
	
	public Mango(String name, String colour, String taste, double price) {
		super(name);
		this.colour = colour;
		this.taste = taste;
		this.price = price;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String toString() {
		return ("Name: " + super.getName() + "\n Colour: " + colour + "\n Taste: " + taste + "\n Price: " + price);
	}
	

}
