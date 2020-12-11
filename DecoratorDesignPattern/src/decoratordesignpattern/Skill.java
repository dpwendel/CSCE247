/*
 * @author Douglas Wendel
 * The skill class consists of setters to the variables
 * declared in class Player. It also has an output statement
 * "Gained a skill" for when players gain a skill. 
 * 
 */
package decoratordesignpattern;
public class Skill extends PlayerDecorator {
	Player player;
	public Skill(Player player) {
		this.name = player.name;
		this.intellect = player.intellect;
		this.defense = player.defense;
		this.attack = player.attack;
		this.weapon = player.weapon;
		this.armor = player.armor;
		this.defense +=2; 
	}
	@Override
	public String toString() {
		return super.toString() + "\nGained a Skill";
	}
	@Override
	public double getPower() {
		return super.getPower();
	}
}
