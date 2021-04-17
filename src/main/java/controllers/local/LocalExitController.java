package main.java.controllers.local;

import main.java.controllers.ExitController;
import main.java.models.Game;

public class LocalExitController extends LocalController
        implements ExitController {

    public LocalExitController(Game game) {
        super(game);
    }

    @Override
    public boolean isFlagInBoard() {
        return this.game.isFlagInFlat();
    }

    @Override
    public boolean isOpenAnyBox() {
        return this.game.isOpenAnyBox();
    }

    @Override
    public void reset() {
        this.game.exit();
    }

    @Override
    public void exit() {
        this.game.exit();
    }
}
