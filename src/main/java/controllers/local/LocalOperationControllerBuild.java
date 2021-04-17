package main.java.controllers.local;

import main.java.models.Game;
import main.java.models.Observer;

public class LocalOperationControllerBuild {

    private final LocalStartController localStartController;

    private final LocalPlayController localPlayController;

    private final LocalContinueController localContinueController;

    public LocalOperationControllerBuild(Observer observer, Game game) {
        this.localStartController = new LocalStartController(observer, game);
        this.localPlayController = new LocalPlayController(observer, game);
        this.localContinueController = new LocalContinueController(observer, game);
    }

    public LocalStartController getStartController() {
        return this.localStartController;
    }

    public LocalPlayController getPlayController() {
        return this.localPlayController;
    }

    public LocalContinueController getContinueController() {
        return this.localContinueController;
    }
}
