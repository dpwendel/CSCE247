/*'
 * @author Douglas Wendel
 * The Goalie class extends Player and
 * decides wether to initiate the BlockGoalBehavior for b
 * oth of its methods. 
 */
package strategydesignpattern;

public class Goalie extends Player {

	public Goalie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setOffenceBehavior() {
		this.offenceBehavior = new BlockGoalBehavior();
	}
	
	@Override
	public void setDefenceBehavior() { 
		this.defenceBehavior = new BlockGoalBehavior(); 
	}
	
	@Override
	public String toString() {
		return name + " plays the position: Goalie";
		
	}
	
	

}
