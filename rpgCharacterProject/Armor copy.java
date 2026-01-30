
/**
 * Armor.java is for creating armor for BasicRPG including
 * its name and armor class. The armor for the game are
 * defined in this class and the list of basic armor
 * for characters in BasicRPG.
 */

import java.util.Arrays;
import java.util.List;
// Do not change this class!
public class Armor implements Chooseable{
	
	public static final Armor PLATE = new Armor("plate", 10);
	public static final Armor CHAIN = new Armor("chain", 7);
	public static final Armor LEATHER = new Armor("leather", 4);
	public static final Armor NO_ARMOR = new Armor("no armor",0);
	
	public static final List<Armor> BASIC_ARMOR_LIST = Arrays.asList(CHAIN, LEATHER);

	
	private String name;  // the name of this armor
	private int armorClass;  // the maximum amount of damage this armor can
					         // defend against
	
	/**
	 * Constructs armor with a name and a class
	 * @param name - the name for this armor
	 * @param armorClass - the armor class for this armor
	 */
	public Armor(String name, int armorClass) {
		this.name = name;
		this.armorClass = armorClass;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	/**
	 * gets the class for this armor
	 * @return the class for this armor
	 */
	public int getArmorClass() {
		return armorClass;
	}
	
	@ Override
	public String toString() {
		return "Armor name: " + name + ", Armor class: " + armorClass;
	}	
}


