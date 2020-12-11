/*
 * @author Douglas Wendel
 * This is a type of superpower and consists of the 
 * setters and the points associated with the warrior. 
 */
package decoratordesignpattern;

public class Warrior extends Player{
	Warrior(String name){
		this.name = "Warrior: " + name; 
		this.intellect = 2;
		this.defense = 5;
		this.attack = 8;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	@Override
	public String toString() {
		return "Warrior: " + super.toString(); 
	}
}
