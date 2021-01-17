package main.java.views;

import main.java.models.*;
import main.java.models.flatFactory.HashFlat;
import main.java.utils.BandHorizontal;
import main.java.utils.BandVertical;
import main.java.utils.IO;

public class BoardView {

    public void write() {
        HashFlat flat = new HashFlat();
        Message.ONE_SPACE.write();
        for (BandHorizontal band : BandHorizontal.values()) {
            Message.TWO_SPACE_INTERSPERSED.write(band.getBandHorizontal());
        }
        Message.JUMP_LINE.writeln();
        for (int i = 0; i < ConstantFlat.LAST_POSITION_ROW; i++) {
            IO.getInstance().write(BandVertical.values()[i].getBandVertical());
            for (int j = 1; j <= ConstantFlat.LAST_POSITION_COLUMN; j++) {
                Message.TWO_SPACE_INTERSPERSED.write(flat.getBox(new Coordinate(i + 1, j)).toString());
            }
            Message.JUMP_LINE.writeln();
        }
    }

    public void writeToken(HashFlat flat) {
        for (int i = 1; i <= ConstantFlat.LAST_POSITION_ROW; i++) {
            for (int j = 1; j <= ConstantFlat.LAST_POSITION_COLUMN; j++) {
                IO.getInstance().write("  " + flat.getBox(new Coordinate(i, j)));
            }
            Message.JUMP_LINE.writeln();
        }
    }

    public static void main(String[] args) {
        new BoardView().write();

    }
}

