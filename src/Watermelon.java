
public class Watermelon extends Fruits{

	private double price;
	private String colour;
	
	public Watermelon(String name,String colour, double price) {
		super(name);
		this.colour = colour;
		this.price = price;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String toString() {
		return("Fruits Name: "  + "\n Colour: " + colour + "\n Price: " + price);
	}
}
