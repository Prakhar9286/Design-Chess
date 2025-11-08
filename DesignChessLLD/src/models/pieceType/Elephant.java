package models.pieceType;

import models.Board;
import models.Cell;
import models.ColorType;
import models.Type;

public class Elephant extends Piece {
    public Elephant(ColorType color) {
        super(Type.ELEPHANT, color);
    }

    @Override
    public Boolean checkIfValidMoveForPiece(Board board, Cell from, Cell to) {
        return (from.getRow() == to.getRow() || from.getCol() == to.getCol());
    }
}
