/*
 * @author Douglas Wendel
 * The player class consists of a boolean, 
 * a string that holds the name of the player
 * and multiple variable setters for later
 * methods declared in other classes. the Player
 * class is basically the main method. 
 */
package strategydesignpattern;

public abstract class Player {
	
	protected String name;
	private boolean offense = true; 
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior; 
	public abstract void setOffenceBehavior(); 
	public abstract void setDefenceBehavior();
	
	public Player(String name) {
		this.name = name;
		setDefenceBehavior();
		setOffenceBehavior(); 
	}
	public String play() {
		if(offense)
			return this.offenceBehavior.play();
		else
			return this.defenceBehavior.play();
	}
	public void turnover() {
		this.offense = !this.offense;
	}
}
