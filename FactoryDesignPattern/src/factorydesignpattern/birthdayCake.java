/*
 * @author Douglas Wendel
 * This class just sets the preferences
 * for the type cake: birthday cake. including
 * the name, price, layers, flavor, shape, icing and 
 * decorations. 
 */
package factorydesignpattern;
public class birthdayCake extends Cake{
	public birthdayCake() {
		this.name = "Birthday Cake";
		this.price = 109.99;
		this.numLayers = 1;
		this.shape = Shape.SHEET;
		this.flavor = "Funfetti";
		this.icing = "Vanilla";
		decorations.add("Sprinkles");
		decorations.add("Candy Flowers");
		decorations.add("Icing Writing");	
	}
}
