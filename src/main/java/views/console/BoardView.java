package main.java.views.console;

import main.java.models.flat.ConstantFlat;
import main.java.models.flat.HashFlat;
import main.java.models.coordinate.Coordinate;
import main.java.type.BandHorizontal;
import main.java.type.BandVertical;
import main.java.utils.IO;

public class BoardView {

    public void write() {
        HashFlat flat = new HashFlat();
        MessageView.ONE_SPACE.write();
        for (BandHorizontal band : BandHorizontal.values()) {
            MessageView.TWO_SPACE_INTERSPERSED.write(band.getBandHorizontal());
        }
        MessageView.JUMP_LINE.writeln();
        for (int i = 0; i < ConstantFlat.LAST_POSITION_ROW; i++) {
            IO.getInstance().write(BandVertical.values()[i].getBandVertical());
            for (int j = 1; j <= ConstantFlat.LAST_POSITION_COLUMN; j++) {
                MessageView.TWO_SPACE_INTERSPERSED.write(flat.getBox(new Coordinate(i + 1, j)).toString());
            }
            MessageView.JUMP_LINE.writeln();
        }
    }

    public void writeToken(HashFlat flat) {
        for (int i = 1; i <= ConstantFlat.LAST_POSITION_ROW; i++) {
            for (int j = 1; j <= ConstantFlat.LAST_POSITION_COLUMN; j++) {
                IO.getInstance().write("  " + flat.getBox(new Coordinate(i, j)));
            }
            MessageView.JUMP_LINE.writeln();
        }
    }

    public static void main(String[] args) {
        new BoardView().write();

    }
}

