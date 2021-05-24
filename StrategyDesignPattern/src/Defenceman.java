package strategydesignpattern;
import java.util.Random;

/*
 * @author Douglas Wendel
 * The Defencemen class randomly chooses between
 * setting the behavior to passbehavior and shoot behavior 
 * within the set offencebehavior method. the setdefencebehavior
 * method chooses wether or not to set chasepuckbehavior or
 * block behavior.
 */

public class Defenceman extends Player{

	public Defenceman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setOffenceBehavior() {
		Random r = new Random(); 
		int temp = r.nextInt(2); 
		if(temp == 0) 
			this.offenceBehavior = new SlapShotBehavior();
		else
			this.offenceBehavior = new PassBehavior();
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
		return name + " plays the position Defenceman";
	}
	

}
