package main.java.views.menu;

import main.java.controllers.OperationController;
import main.java.models.coordinate.Coordinate;
import main.java.models.flat.ConstantFlat;
import main.java.utils.LimitIntDialog;
import main.java.views.console.BoardView;
import main.java.views.console.ErrorView;
import main.java.controllers.error.Error;
import main.java.views.utils.Message;

class OpenBoxCommand extends Command {

    OpenBoxCommand(String title, OperationController operationController) {
        super(title, operationController);
    }

    @Override
    void execute() {
        int row = LimitIntDialog.getInstance().read(Message.ENTER_ROW.geTitle(), ConstantFlat.LAST_POSITION_ROW);
        int column = LimitIntDialog.getInstance().read(Message.ENTER_COLUMN.geTitle(), ConstantFlat.LAST_POSITION_COLUMN);
        Coordinate coordinate = new Coordinate(row, column);
        if (this.operationController.isFlagInBox(coordinate)) {
            new ErrorView(Error.THERE_IS_A_FLAG_IN_BOX.title()).write();
        } else if (this.operationController.isOpenBox(coordinate)) {
            new ErrorView(Error.IS_OPEN_THE_BOX.title()).write();
        } else if (this.operationController.isMineInBox(coordinate)) {
            //new ResultGameView(acceptorController).write();
        } else if (this.operationController.isCompleteBoard()) {
            this.operationController.end();
        } else {
            this.operationController.openBox(coordinate);
            new BoardView(operationController).write();
        }
    }

    @Override
    boolean isActive() {
        return true;
    }
}
