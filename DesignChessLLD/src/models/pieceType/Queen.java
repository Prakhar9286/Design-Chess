package models.pieceType;

import models.Board;
import models.Cell;
import models.ColorType;
import models.Type;

public class Queen extends Piece {
    public Queen(ColorType color) {
        super(Type.QUEEN, color);
    }

    @Override
    public Boolean checkIfValidMoveForPiece(Board board, Cell from, Cell to) {
        int rowDiff = Math.abs(from.getRow() - to.getRow());
        int colDiff = Math.abs(from.getCol() - to.getCol());

        return (rowDiff == colDiff || from.getRow() == to.getRow() || from.getCol() == to.getCol());
    }
}
