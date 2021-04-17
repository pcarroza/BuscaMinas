package main.java.views.console;

import main.java.controllers.ContinueController;
import main.java.utils.YesNoDialog;

public class ContinueOptionReader extends OptionView {

    ContinueOptionReader(ContinueController continueController) {
        this.operationController = continueController;
    }

    @Override
    public void read() {
        assert YesNoDialog.getInstance() != null;
        if (YesNoDialog.getInstance().read()) {
            this.operationController.reset();
        } else {
            this.operationController.exit();
        }
    }
}
