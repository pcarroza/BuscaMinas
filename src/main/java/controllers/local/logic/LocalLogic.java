package main.java.controllers.local.logic;

import main.java.Logic;
import main.java.controllers.OperationController;
import main.java.controllers.local.LocalOperationControllerBuild;
import main.java.models.Game;
import main.java.models.Observer;

public class LocalLogic implements Logic, Observer {

    private State actualState;

    private final StatesBuilder statesBuilder;

    public LocalLogic() {
        Game game = new Game(this);
        LocalOperationControllerBuild localOperationControllerBuild;
        localOperationControllerBuild = new LocalOperationControllerBuild(this, game);
        this.statesBuilder = new StatesBuilder(localOperationControllerBuild);
        this.initialize();
    }

    @Override
    public void initialize() {
        this.actualState = this.statesBuilder.getInitialState();
    }

    @Override
    public void begin() {
        this.actualState = this.statesBuilder.getInGameState();
    }

    @Override
    public void end() {
        this.actualState = this.statesBuilder.getFinalState();
    }

    @Override
    public void exit() {
        this.actualState = this.statesBuilder.getExitState();
    }

    @Override
    public OperationController getController() {
        return this.actualState.getOperationController();
    }
}
