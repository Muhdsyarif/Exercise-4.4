
public class Apple extends Fruits {		// Apple as a sub class extends of fruits

	private String colour;
	private int quantity;
	protected double price;
	
	//Constructor
	public Apple(String name,String colour, int quantity, double price) {
		super(name);
		this.colour = colour;
		this.quantity = quantity;
		this.price = price;
		
		if(this.quantity  < 10) {	//overloading without argument
			System.out.println("Total Price: RM" + totalPrice());
		}
		else if(this.quantity >= 10 && this.quantity < 50) {	//overloading with 1 argument
			double p = 1.50;
			System.out.println("Total Price: RM" + totalPrice(p));
		}
		else {	//overloading with 2 argument
			double p = 1.00;
			int q = this.quantity;
			System.out.println("Total Price: RM" + totalPrice(q,p));
		}

	}
	
	
	public double totalPrice() { //overloading method
		return this.price*this.quantity;
	}
	
	public double totalPrice(double p) {
		return p*this.quantity;
	}
	
	public double totalPrice(int q, double p) {
		return p*q;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String toString() { //overrinding method
		return("Fruits Name: " + super.getName() + "\n Colour: " + this.getColour());
	}
	
	
}
