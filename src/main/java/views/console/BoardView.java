package main.java.views.console;

import main.java.controllers.OperationController;

import main.java.models.flat.ConstantFlat;
import main.java.models.coordinate.Coordinate;
import main.java.type.BandHorizontal;
import main.java.type.BandVertical;
import main.java.utils.Console;
import main.java.views.utils.Space;

public class BoardView {
    
    private final OperationController operationController;

    public BoardView(OperationController operationController) {
        this.operationController = operationController;
    }

    public void write() {
        Space.ONE_SPACE.write();
        for (BandHorizontal band : BandHorizontal.values()) {
            Space.TWO_SPACE_INTERSPERSED.write(band.getBandHorizontal());
        }
        Space.JUMP_LINE.writeln();
        for (int i = 0; i < ConstantFlat.LAST_POSITION_ROW; i++) {
            Console.getInstance().write(BandVertical.values()[i].getBandVertical());
            for (int j = 1; j <= ConstantFlat.LAST_POSITION_COLUMN; j++) {
                String box = this.operationController.getBox(new Coordinate(i + 1, j)).toString();
                Space.TWO_SPACE_INTERSPERSED.write(box);
            }
            Space.JUMP_LINE.writeln();
        }
    }
}

