package main.java.controllers.local.logic;

import main.java.controllers.local.LocalOperationController;

public class ExitState extends State {

    public ExitState(StatesBuilder statesBuilder) {
        super(statesBuilder);
    }

    @Override
    LocalOperationController getOperationController() {
        return null;
    }
}
