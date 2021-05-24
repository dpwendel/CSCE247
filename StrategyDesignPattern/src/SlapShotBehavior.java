/*
 * @author Douglas Wendel
 * The slapShotBehavior class has one method
 * that is the play method and it simply returns
 * "shoots the puck from the blue line."
 */
package strategydesignpattern;

public class SlapShotBehavior implements OffenceBehavior {
	@Override
	public String play() {
		return "shoots the puck from the blue line";
	}

}
