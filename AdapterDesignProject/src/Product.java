/*
 * Douglas Wendel 2020
 * This is just a class that contains simple getters and setters, etc.
 */
public class Product implements ProductListing {
	
	private String title, description;
	private double price;
	
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}
		
		public String getTitle(){
			return title;
		}
		public double getPrice() {
			return price;
		}
		public String getDescription() { 
			return description;
		}
}


