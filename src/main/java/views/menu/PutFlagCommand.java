package main.java.views.menu;

import main.java.controllers.OperationController;
import main.java.controllers.error.Error;
import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;
import main.java.utils.LimitIntDialog;
import main.java.views.console.ErrorView;

class PutFlagCommand extends Command {

    PutFlagCommand(String title, OperationController operationController) {
        super(title, operationController);
    }

    @Override
    void execute() {
        boolean error = true;
        int row = new LimitIntDialog(1, ConstantFlat.LAST_POSITION_ROW).read("Ingrese Opción: ");
        int column = new LimitIntDialog(1, ConstantFlat.LAST_POSITION_COLUMN).read("Ingrese Opción: ");
        do {
            if (this.operationController.isFlagInBox(new Coordinate(row, column))) {
                new ErrorView(Error.THERE_IS_A_FLAG_IN_BOX.title()).write();
            } else if (this.operationController.isOpenBox(new Coordinate(row, column))) {
                new ErrorView(Error.IS_OPEN_THE_BOX.title());
            } else {
                error = false;
            }
        } while (error);
        this.operationController.putFlagInBox(new Coordinate(row, column));
    }

    @Override
    boolean isActive() {
        return true;
    }
}
