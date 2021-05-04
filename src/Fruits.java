
public class Fruits {		// Fruits is parent class

	protected String name;
	
	public Fruits(String name) {
		this.name = name;
		System.out.println(this.name + " constructor is invoked");
	}

	//Getter
	public String getName() {
		return this.name;
	}
}
