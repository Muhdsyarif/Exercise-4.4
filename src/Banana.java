
public class Banana extends Fruits{		// Banana as a sub class extends of fruits

	protected String colour;
	protected double price;
	protected int quantity;
	
	public Banana(String name, String colour, double price, int quantity) {
		super(name);
		this.colour = colour;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public String getColour() {
		return this.colour;
	}

	public String toString() { //overriding method
		return("Fruits Name: " + super.getName() + "\n Colour of banana: " + colour + "\n Price: " + price);
	}
}
