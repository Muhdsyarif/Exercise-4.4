
public class Orange extends Fruits{			// Orange as a sub class extends of fruits

	private String colour;
	private double weight, price;
	
	public Orange(String name,String colour, double weight, double price) {
		super(name);
		this.colour = colour;
		this.weight = weight;
		this.price = price;
		
		if(this.weight < 1.00) {
			System.out.println("Total Price: RM" + totalPrice());
		}
		else if(this.weight >= 1.00) {
			double p = 8;
			System.out.println("Total Price: RM" + totalPrice(p));
		}
		else {
			double p = 5;
			double w = this.weight;
			System.out.println("Total Price: RM" + totalPrice(p,w));
		}
	}
	
	
	public double totalPrice() { //overloading method
		return this.price * this.weight;
	}
	
	public double totalPrice(double p) {	
		return p*this.weight;
	}
	
	public double totalPrice(double p, double w) {
		return p*w; 
	}
	
	public String getColour() {
		return this.colour;
	}
	
	
	public String toSrting() {
		return("Fruits Name: " + super.getName() + "\n Colour: " + this.getColour());
	}
	
	

}
