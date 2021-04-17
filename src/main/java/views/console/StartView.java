package main.java.views.console;

import main.java.controllers.StartController;
import main.java.views.utils.Message;

public class StartView {

    public void interact(StartController startController) {
        Message.writeWelcomeTitle();
        startController.begin();
    }
}
