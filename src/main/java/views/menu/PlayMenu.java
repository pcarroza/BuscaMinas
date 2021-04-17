package main.java.views.menu;

import main.java.controllers.PlayController;

public class PlayMenu extends Menu {

    public PlayMenu(PlayController playController) {
        this.setCommand(new OpenBoxCommand(TitleOptions.OPEN_BOX.getTitle(), playController));
        this.setCommand(new PutFlagCommand(TitleOptions.PUT_FLAG_IN_BOX.getTitle(), playController));
        this.setCommand(new RemoveFlagCommand(TitleOptions.REMOVE_FLAG.getTitle(), playController));
        this.setCommand(new ExitCommand(TitleOptions.EXIT_GAME.getTitle(), playController));
    }
}
