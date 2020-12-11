/*
 * @author Douglas Wendel
 * This class declares the armor upgrade, the defense, the setters
 * and what is returned to the console. 
 * 
 */
package decoratordesignpattern;
public class ArmorUpgrade extends PlayerDecorator{
	Player player;
	public ArmorUpgrade(Player player) {
		this.name = player.name;
		this.intellect = player.intellect;
		this.defense = player.defense;
		this.attack = player.attack;
		this.weapon = player.weapon;
		this.armor = player.armor;
		this.defense +=3;
	}
	@Override
	public String toString() {
		return super.toString() + "\nUpgraded armor";
	}
	@Override
	public double getPower() {
		return super.getPower();
	}
}
