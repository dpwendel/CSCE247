/*
 * @author Douglas Wendel
 * 
 * Mage is a class assigned to a player. It consists of its 
 * points and the setters that go with it. It also has a toString
 * that returns the correct words. 
 */
package decoratordesignpattern;

public class Mage extends Player {
	public Mage(String name) {
		this.name = "Mage: " + name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	@Override
	public String toString() { 
		return "Mage: " +super.toString();
	}
}
