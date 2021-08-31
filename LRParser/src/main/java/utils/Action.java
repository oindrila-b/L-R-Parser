package utils;

public class Action {

    private ActionType actionType;
    private int operand;

    public Action(ActionType actionType, int operand) {
        this.actionType = actionType;
        this.operand = operand;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public int getOperand() {
        return operand;
    }

    @Override
    public String toString() {
        return  actionType + " " + ((actionType == ActionType.ACCEPT) ? "": operand);
    }
}
