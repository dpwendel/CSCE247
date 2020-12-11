/*
 * @author Douglas Wendel
 * THis is the main class that creates the cake. It has many
 * different methods to create the layers, frost the cake, add the
 * decorations, and decide the price of the cake, which will then return
 * the infgormation that was added and information about the cake
 * including the price 
 */
package factorydesignpattern;
import java.util.ArrayList;
public abstract class Cake {
	protected double price; 
	protected int numLayers;
	protected Shape shape;
	protected String flavor, icing, name;
	protected ArrayList<String> decorations;
	public Cake() {
		decorations = new ArrayList<>();
	}
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
	}
	private void createLayers() {
		switch(shape) {
		case BUNT:
			System.out.println("Creating "+flavor+" bunt cake");
			break;
		case CUPCAKES:
			System.out.println("Creating "+flavor+" cupcakes");
			break;
		case ROUND:
		case SHEET:
			if(numLayers == 1) 
				System.out.println("Creating a 1 layer "+shape.toString().toLowerCase()+" " +flavor+" cake");
			else
				System.out.println("Creating a "+numLayers+ " layered "+shape.toString().toLowerCase() + " "+flavor+ " cake");
			break;
		}
	}
	private void frostCake() {
		System.out.println("frost cake with " +icing + " icing");
	}
	private void addDecorations() {
		for(String item:decorations) {
			System.out.println("adding "+item);
		}
	}
	public double getPrice() {
		return price;	
	}
}


