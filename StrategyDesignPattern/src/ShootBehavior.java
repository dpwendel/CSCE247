/*
 * @author Douglas Wendel
 * the ShootBehavior class implements offence behavior.
 * this class has one method that calls play to return 
 * "shoots at the goal"
 */
package strategydesignpattern;

public class ShootBehavior implements OffenceBehavior {
	@Override
	public String play() {
		return "shoots at the goal";
	}

}
