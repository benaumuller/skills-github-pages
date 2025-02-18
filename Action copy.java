/**
 * The Action class defines the actions for the characters
 * in BasicRPG. 
 *
 */
// Do not change this class
public class Action implements Chooseable {
	
	// common actions
	public static final Action WIELD = new Action("Wield a weapon", false);
	public static final Action UNWIELD = new Action("Unwield a weapon", false);
	public static final Action FIGHT = new Action("Fight",true);
	public static final Action CHECK_STATUS = new Action("Check Status",false);
	public static final Action END_TURN = new Action("End turn",false);

	// wizard actions
	public static final Action CAST_SPELL = new Action("Cast spell",true);
	public static final Action REGAIN_SPELL_POINTS = new Action("Regain spell points", true);
	
	// fighter actions
	public static final Action PUT_ON_ARMOR = new Action("Put on armor",false);
	public static final Action REMOVE_ARMOR = new Action("Remove armor",false);
	
	
	private String actionText;    // the text displayed for this action
	private boolean onlyOncePerTurn;  // whether this action can be chosen only once in a turn
	
	/**
	 * Constructs an action for characters in BasicRPG
	 * @param actionText - the text to be displayed for this action
	 * @param onlyOncePerTurn - whether this action can be chosen only once per turn
	 */
	public Action(String actionText, boolean onlyOncePerTurn) {
		this.actionText = actionText;
		this.onlyOncePerTurn = onlyOncePerTurn;
	}

	/**
	 * Returns true if this action can only be chosen once per turn
	 * @return true if this action can only be chosen once per turn
	 */
	public boolean isOnlyOncePerTurn() {
		return onlyOncePerTurn;
	}

	@Override
	public String getName() {
		return actionText;
	}
	
	@Override
	public String toString() {
		return actionText + " Once per turn? " + onlyOncePerTurn;
	}
	
}
