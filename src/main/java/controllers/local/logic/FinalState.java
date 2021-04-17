package main.java.controllers.local.logic;

import main.java.controllers.local.LocalContinueController;
import main.java.controllers.local.LocalOperationController;
import main.java.controllers.local.LocalOperationControllerBuild;

public class FinalState extends State {

    private final LocalContinueController localContinueController;

    public FinalState(StatesBuilder statesBuilder, LocalOperationControllerBuild localOperationControllerBuild) {
        super(statesBuilder);
        this.localContinueController = localOperationControllerBuild.getContinueController();
    }

    @Override
    public State initialize() {
        return this.statesBuilder.getInitialState();
    }

    @Override
    public State exit() {
        return this.statesBuilder.getExitState();
    }

    @Override
    LocalOperationController getOperationController() {
        return this.localContinueController;
    }
}
