package main.java.controllers.local.logic;

import main.java.controllers.local.LocalOperationControllerBuild;

class StatesBuilder {

    private final InitialState initialState;

    private final InGameState inGameState;

    private final FinalState finalState;

    private final ExitState exitState;

    StatesBuilder(LocalOperationControllerBuild localOperationControllerBuild) {
        this.initialState = new InitialState(this, localOperationControllerBuild);
        this.inGameState = new InGameState(this, localOperationControllerBuild);
        this.finalState = new FinalState(this, localOperationControllerBuild);
        this.exitState = new ExitState(this);
    }

    InitialState getInitialState() {
        return this.initialState;
    }

    InGameState getInGameState() {
        return this.inGameState;
    }

    FinalState getFinalState() {
        return this.finalState;
    }

    ExitState getExitState() {
        return this.exitState;
    }
}
