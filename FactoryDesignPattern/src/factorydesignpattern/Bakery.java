/*
 * @author Douglas Wendel
 * The Bakery class just creates the cake once it is ordered.
 * It then returns the price of the cake that you ordered.
 * and tells the console what type of cake to create.
 */
package factorydesignpattern;

public class Bakery {
	
	public Cake orderCake(String type) {
		Cake cake = createCake(type);
		cake.createCake();
		System.out.println("Price: $" +cake.getPrice());
		return cake;
	}
	private Cake createCake(String type) {
		if(type.equalsIgnoreCase("carrot cake")) {
			return new carrotCake();
		}
		else if(type.equalsIgnoreCase("black forest cake")) {
			return new blackForestCake();
		}
		else if(type.equalsIgnoreCase("birthday cake")) {
			return new birthdayCake();
		}
		else
			return null;
	}
}
