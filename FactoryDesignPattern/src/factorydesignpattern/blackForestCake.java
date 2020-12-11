/*
 * @author Douglas Wendel
 * This class just sets the preferences
 * for the type cake: BlackForest cake. including
 * the name, price, layers, flavor, shape, icing and 
 * decorations. 
 */
package factorydesignpattern;
public class blackForestCake extends Cake {
	public blackForestCake() {
		this.name = "Black Forest Cake";
		this.price = 47.99;
		this.numLayers = 3;
		this.shape = Shape.ROUND;
		this.flavor = "Black Forest";
		this.icing = "Whipped Cream";
		decorations.add("Cherries");
		decorations.add("Chocolate Flakes");
		decorations.add("Whipped Cream");
	}
}
