/*
 * @author Douglas Wendel
 * This is the main player class, this declares the main toString and 
 * the calculations for getPower. It also declares the variables 
 * name weapon armor intellect defense and attack
 * 
 */
package decoratordesignpattern;
public abstract class Player {	
	protected String name, weapon, armor;
	protected int intellect, defense, attack;
	public String toString() {
		return name + "\nCarries a " + this.weapon + 
				", and wears a " + armor; //the generic part of the toString;
	}
	public double getPower() {
		return (attack * 3) + defense + (intellect /2);
	}
}
