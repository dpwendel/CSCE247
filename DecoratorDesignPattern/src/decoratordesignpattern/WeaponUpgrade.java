/*
 * @author Douglas Wendel
 * The class WeaponUpgrade consists of the setters
 * to the variables declared in player and output and
 * get power. 
 * 
 */
package decoratordesignpattern;
public class WeaponUpgrade extends PlayerDecorator {
	private Player player;
	public WeaponUpgrade(Player player) {
		this.name = player.name;
		this.intellect = player.intellect;
		this.defense = player.defense;
		this.attack = player.attack;
		this.weapon = player.weapon;
		this.armor = player.armor;
		this.defense +=5;
	}
	@Override
	public String toString() {
		return super.toString() + "\nUpgraded weapon";
	}
	@Override
	public double getPower() {
		return super.getPower();
	}
}
