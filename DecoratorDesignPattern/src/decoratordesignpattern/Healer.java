/*
 * @author Douglas Wendel
 * 
 * Healer is a class that a player is assigned to. 
 * it consists of many setters and a tostring to output Healer:
 * 
 */
package decoratordesignpattern;
public class Healer extends Player {
	public Healer(String name) {
		this.name = "Healer: " + name; 
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	@Override
	public String toString() {
		return "Healer: " +super.toString(); 
	}
}
