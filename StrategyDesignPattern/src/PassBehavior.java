/*
 * @author Douglas Wendel
 * The PassBehaavior class implements 
 * offenceBehavior and calls the 
 * play method to return "passes to a forward."
 */
package strategydesignpattern;

public class PassBehavior implements OffenceBehavior {
	@Override
	public String play() {
		return "passes to a forward";
	}

}
