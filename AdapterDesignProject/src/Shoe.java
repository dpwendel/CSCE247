/*
 * Douglas Wendel 2020
 * This class contains variables and a toString that is called in the ShoeListingAdapter class
 * that prints the information of the shoe in its specific order and setting. 
 */
public class Shoe implements ShoeListing {
	
	private String brand, name, description;
	private double cost;
	
	public Shoe(String brand, String name, double cost, String description) {
		this.brand = brand;
		this.name = name; 
		this.cost = cost;
		this.description = description;
	}
	
	public String toString() {
		String shoe = "";
		shoe = name;
		shoe = shoe + " By: " +brand;
		shoe = shoe + " Details: " + description;
		shoe = shoe + " Cost: $" + cost;
		return shoe; 
	}
	

}
