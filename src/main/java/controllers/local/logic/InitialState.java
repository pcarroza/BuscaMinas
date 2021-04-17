package main.java.controllers.local.logic;

import main.java.controllers.local.LocalOperationController;
import main.java.controllers.local.LocalOperationControllerBuild;
import main.java.controllers.local.LocalStartController;

public class InitialState extends State {

    private final LocalStartController localStartController;

    public InitialState(StatesBuilder statesBuilder, LocalOperationControllerBuild localOperationControllerBuild) {
        super(statesBuilder);
        localStartController = localOperationControllerBuild.getStartController();
    }

    @Override
    State begin() {
        return statesBuilder.getInGameState();
    }

    @Override
    LocalOperationController getOperationController() {
        return this.localStartController;
    }
}
