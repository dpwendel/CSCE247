/*
 * Copyright Douglas Wendel 2020
 * This is a simple class that returns the title, price, and description of the shoe. It also includes the ShoeListingAdapter method which 
 * uses substring and indexOf to gather the information that is needed.
 */
public class ShoeListingAdapter implements ProductListing {
	
	private ShoeListing shoe; //private instance of shoe, it doesnt do anything but its here.
	private String title, brand, description;
	private double price;
	
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price; 
	}
	public String getDescription() {
		return "Created by " +brand + ", " +description; 
	}
	public ShoeListingAdapter(ShoeListing shoe)
	{
		String info = shoe.toString();
		
		title = info.substring(info.indexOf("Shoe:")+1, info.indexOf("By:"));
		price = Double.parseDouble(info.substring(info.indexOf("$")+1));
		brand = info.substring(info.indexOf("By:")+4, info.indexOf("Details:"));
		description = info.substring(info.indexOf("Details:")+9, info.indexOf("Cost:"));
	}

}
