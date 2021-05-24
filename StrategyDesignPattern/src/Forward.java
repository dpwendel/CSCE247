/*
 * @Author Douglas Wendel
 * The forward class chooss the setOffenceBehavior
 * and setDefenceBehavior. setOffenceBehavior has the option 
 * to set the passBehavior and shootBehavior. The setDefenseBehavior
 * has the option to be either the ChasePuckBehavior or Block Behavior. 
 * This class utilizes random number decision and many if statements to
 * fairly decide the final outcome. 
 */
package strategydesignpattern;

import java.util.Random; 

public class Forward extends Player {
	
	public Forward(String name) { //is this supposed to say center(string name)
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setOffenceBehavior() {
		Random r = new Random();
		int temp = r.nextInt(2); 
		if(temp == 0)
			this.offenceBehavior = new PassBehavior();
		else
			this.offenceBehavior = new ShootBehavior(); 
	}
	@Override
	public void setDefenceBehavior() { 
		Random r = new Random(); 
		int temp = r.nextInt(2);
		if(temp == 0)
			this.defenceBehavior = new ChasePuckBehavior(); 
		else
			this.defenceBehavior = new BlockBehavior(); 
	}
	
	@Override
	public String toString() {
		return name + " plays the position: Foward";
	}

}
