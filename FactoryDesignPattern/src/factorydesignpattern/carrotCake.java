/*
 * @author Douglas Wendel
 * This class just sets the preferences
 * for the type cake: Carrot cake. including
 * the name, price, layers, flavor, shape, icing and 
 * decorations. 
 */
package factorydesignpattern;
public class carrotCake extends Cake{
	public carrotCake() {
		this.name = "Carrot Cake";
		this.price = 54.99;
		this.numLayers = 2;
		this.shape = Shape.ROUND;
		this.flavor = "Carrot";
		this.icing = "Cream Cheese";
		decorations.add("Walnuts");
		decorations.add("Candy Carrots");
	}
}
