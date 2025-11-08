package models.pieceType;

import models.Board;
import models.Cell;
import models.ColorType;
import models.Type;

public class Horse extends Piece {
    public Horse(ColorType color) {
        super(Type.HORSE, color);
    }

    @Override
    public Boolean checkIfValidMoveForPiece(Board board, Cell from, Cell to) {
        int rowDiff = Math.abs(from.getRow() - to.getRow());
        int colDiff = Math.abs(from.getCol() - to.getCol());

        return ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2));
    }
}
