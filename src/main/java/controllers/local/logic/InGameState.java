package main.java.controllers.local.logic;

import main.java.controllers.local.LocalOperationController;
import main.java.controllers.local.LocalOperationControllerBuild;
import main.java.controllers.local.LocalPlayController;

public class InGameState extends State {

    private final LocalPlayController localPlayController;

    public InGameState(StatesBuilder statesBuilder, LocalOperationControllerBuild localOperationControllerBuild) {
        super(statesBuilder);
        this.localPlayController = localOperationControllerBuild.getPlayController();
    }

    @Override
    State end() {
        return statesBuilder.getFinalState();
    }

    @Override
    LocalOperationController getOperationController() {
        return this.localPlayController;
    }
}
