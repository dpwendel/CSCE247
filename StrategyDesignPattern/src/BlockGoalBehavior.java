package strategydesignpattern;
import java.util.Random;

/*
 * @author Douglas Wendel
 * Block Goal Behavior implements offencebehavior and defencebehavior
 * and consists of a random number generator between the ints of 0-3 
 * whichever number is generated it will go through the if statements
 * and decide which one to print. 
 */

public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior {
	@Override
	public String play() {
		Random r = new Random();
		int num = r.nextInt(4); 
		if(num == 0) 
			return "Hand blocks the puck";
		else if(num == 1)
			return "Catches the puck";
		else if(num==2)
			return "Blocks puck with knee pads";
		else
			return "Blocks puck with stick";
	}
}
