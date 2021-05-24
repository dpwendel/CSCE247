/*
 * @author Douglas Wendel
 * BlockBehavior implements DefenceBehavior, it consists
 * of multiple if statements that run through a random
 * integer decider between 0-3. Depending on the number 
 * that is randomly chosen, it will print what that
 * number is assigned to.
 * 
 */
package strategydesignpattern;
import java.util.Random;

public class BlockBehavior implements DefenceBehavior {
	@Override
	public String play() {
		Random r = new Random(); 
		int num = r.nextInt(3); 
		if(num == 0)
			return "blocks player from passing";
		else if(num == 1)
			return "blocks player from shooting";
		else
			return "checks player with puck";		
	}
}
