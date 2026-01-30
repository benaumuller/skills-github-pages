/**
 * Name: 
 * Date:
 * CSC 202
 * Project 2- RPGCharacter class
 * 
 * Description: This class models one character in a basic roll playing game
 * 
 * Citations of Assistance (who and what OR declare no assistance):
 * 
 */
import java.util.ArrayList;
import java.util.List;

public abstract class RPGCharacter implements Chooseable{
	/**
	 * Number of sides for the die used in attacks
	 */
	public static final int NUMBER_SIDES_FOR_ATTACK = 12;
	
	/**
	 * The die with NUMBER_SIDES_FOR_ATTACK sides to be rolls when a fight
	 * ensues or a damaging spell is cast
	 */
	public static MultiSidedDie attackDie = new MultiSidedDie(NUMBER_SIDES_FOR_ATTACK);
	
	// Data fields
	private Weapon weapon;
	
	/**
	 * Note: subclasses should override this method to provide a set of
	 * actions specific to that class.  Usually, the subclass should
	 * call RPGCharacter's getActionList() and prepend any additional
	 * character-specific actions to the front of it.
	 * @return list of actions currently available for this character
	 */
	public List<Action> getActionList() {
		List<Action> actions = new ArrayList<>();
		if (weapon == Weapon.HANDS) {
			actions.add(Action.WIELD);
		} else {
			actions.add(Action.UNWIELD);
		}
		actions.add(Action.FIGHT);
		actions.add(Action.CHECK_STATUS);
		actions.add(Action.END_TURN);
		return actions;
	}

	public abstract List<Weapon> getAllowedWeaponList();
	
	public abstract List<Armor> getAllowedArmorList();
	
	
}
